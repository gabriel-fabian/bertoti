package strategy.II.src.main.java.game.strategies;

import strategy.II.src.main.java.game.characters.Creature;

public interface AttackStrategy {
  void attack(Creature attacker, Creature target);
}
