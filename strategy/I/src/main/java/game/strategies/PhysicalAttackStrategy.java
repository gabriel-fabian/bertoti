package src.main.java.game.strategies;

import src.main.java.game.characters.Creature;

public class PhysicalAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Creature attacker, Creature target) {
    System.out.println(attacker.getName() + " used Ice Attack on " + target.getName());
  }
}
