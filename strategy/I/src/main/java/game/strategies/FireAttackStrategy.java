package src.main.java.game.strategies;

import src.main.java.game.characters.Creature;

public class FireAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Creature attacker, Creature target) {
    System.out.println(attacker.getName() + " used Fire Attack on " + target.getName());
  }
}
