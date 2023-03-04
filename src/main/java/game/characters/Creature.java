package src.main.java.game.characters;

import java.util.HashMap;

import src.main.java.game.strategies.AttackStrategy;

public abstract class Creature {
  private String name;
  private int health;
  private HashMap<String, Integer> damages;
  private HashMap<String, Integer> resistances;
  private AttackStrategy attackStrategy;

  public Creature(String name, int health, HashMap<String,Integer> damages, HashMap<String,Integer> resistances, AttackStrategy attackStrategy) {
    this.name = name;
    this.health = health;
    this.damages = damages;
    this.resistances = resistances;
    this.attackStrategy = attackStrategy;
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getDamage(String damageType) {
    return damages.getOrDefault(damageType, 0);
  }

  public void setDamage(String damageType, int damage) {
    this.damages.put(damageType, damage);
  }

  public int getResistance(String damageType) {
    return resistances.getOrDefault(damageType, 0);
  }

  public void setResistance(String damageType, int damage) {
    this.resistances.put(damageType, damage);
  }

  public boolean isAlive() {
    return health > 0;
  }

  public void takeDamage(int damageAmount, String damageType) {
    int resistanceAmount = resistances.getOrDefault(damageType, 0);
    int actualDamage = Math.max(damageAmount - resistanceAmount, 0);
    health -= actualDamage;
  }

  public void setAttackStrategy(AttackStrategy attackStrategy) {
    this.attackStrategy = attackStrategy;
  }

  public void attack(Creature target) {
    attackStrategy.attack(this, target);
  }
}
