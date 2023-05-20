package src.main.java.game.strategies;

import src.main.java.game.characters.Creature;

public class IceAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Creature attacker, Creature target) {
    int damageAmount = attacker.getDamage("ICE");

    target.takeDamage(damageAmount, "ICE");
  }
}
