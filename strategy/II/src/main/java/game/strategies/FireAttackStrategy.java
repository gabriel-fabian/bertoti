package strategy.II.src.main.java.game.strategies;

import strategy.II.src.main.java.game.characters.Creature;

public class FireAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Creature attacker, Creature target) {
    int damageAmount = attacker.getDamage("FIRE");

    target.takeDamage(damageAmount, "FIRE");
  }
}
