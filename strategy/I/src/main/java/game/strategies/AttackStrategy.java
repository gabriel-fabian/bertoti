package src.main.java.game.strategies;

import src.main.java.game.characters.Creature;

public interface AttackStrategy {
  void attack(Creature attacker, Creature target);
}
