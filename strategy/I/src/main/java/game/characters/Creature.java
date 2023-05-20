package src.main.java.game.characters;

import src.main.java.game.strategies.AttackStrategy;

public class Creature {
  private String name;
  private AttackStrategy attackStrategy;

  public Creature(String name, AttackStrategy attackStrategy) {
    this.name = name;
    this.attackStrategy = attackStrategy;
  }

  public String getName() {
    return name;
  }

  public void setAttackStrategy(AttackStrategy attackStrategy) {
    this.attackStrategy = attackStrategy;
  }

  public void attack(Creature target) {
    attackStrategy.attack(this, target);
  }
}
