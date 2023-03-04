package src.main.java.game.strategies;

import src.main.java.game.characters.Creature;

public class PhysicalAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Creature attacker, Creature target) {
    int damageAmount = attacker.getDamage("PHYSICAL");
    int resistanceAmount = target.getResistance("PHYSICAL");
    int actualDamage = Math.max(damageAmount - resistanceAmount, 0);

    target.takeDamage(actualDamage, "PHYSICAL");
  }
}
