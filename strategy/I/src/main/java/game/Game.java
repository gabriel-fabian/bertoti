package src.main.java.game;

import java.util.Scanner;

import src.main.java.game.battle.Battle;
import src.main.java.game.characters.Creature;
import src.main.java.game.strategies.PhysicalAttackStrategy;

public class Game {
  private Creature player;
  private Creature enemy;

  public Game(Creature player, Creature enemy) {
    this.player = player;
    this.enemy = enemy;
  }

  public void run() {
    System.out.println("Starting game!");

    Battle encounter = new Battle(player, enemy);

    encounter.start();
  }

  public static void main(String[] args) {
	  try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Type character name: ");
      String playerName = scanner.nextLine();

      // Move to factory creation
      Creature player = new Creature(playerName, new PhysicalAttackStrategy());

      Creature enemy = new Creature("Goblin", new PhysicalAttackStrategy());

      Game game = new Game(player, enemy);
      game.run();
    }
  }
}
