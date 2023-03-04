package src.main.java.game.characters;

import java.util.HashMap;

import src.main.java.game.strategies.AttackStrategy;

public class Enemy extends Creature {

  public Enemy(String name, int health, HashMap<String, Integer> damages, HashMap<String, Integer> resistances, AttackStrategy attackStrategy) {
    super(name, health, damages, resistances, attackStrategy);
  }
}
