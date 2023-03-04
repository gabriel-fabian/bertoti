package src.main.java.game.characters;

import java.util.HashMap;

import src.main.java.game.strategies.AttackStrategy;

public class Player extends Creature {

  public Player(String name, int health, HashMap<String, Integer> damages, HashMap<String, Integer> resistances, AttackStrategy attackStrategy) {
    super(name, health, damages, resistances, attackStrategy);
  }
}
