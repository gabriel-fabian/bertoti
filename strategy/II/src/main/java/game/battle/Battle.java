package src.main.java.game.battle;

import java.util.Scanner;

import src.main.java.game.characters.Creature;
import src.main.java.game.strategies.FireAttackStrategy;
import src.main.java.game.strategies.IceAttackStrategy;
import src.main.java.game.strategies.PhysicalAttackStrategy;

public class Battle {
  private Creature player;
  private Creature enemy;

  public Battle(Creature player, Creature enemy) {
    this.player = player;
    this.enemy = enemy;
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("You've found a %s%n", enemy.getName());

    // Refactor: move to Player class and make that in every turn Player can choose which attack to use
    System.out.printf("Which attack strategy do you wanna use?: %n", enemy.getName());
    System.out.printf("1. Physical Attack %n");
    System.out.printf("2. Fire Attack %n");
    System.out.printf("3. Ice Attack %n");

    int selection = scanner.nextInt();

    switch (selection) {
      case 1:
        player.setAttackStrategy(new PhysicalAttackStrategy());
        break;
      case 2:
        player.setAttackStrategy(new FireAttackStrategy());
        break;
      case 3:
        player.setAttackStrategy(new IceAttackStrategy());
        break;
      default:
        System.out.println("Invalid selection. Defaults to Physical");
        break;
    }

    while (player.isAlive() && enemy.isAlive()) {
      System.out.println(player.getName() + " has " + player.getHealth() + " HPs" + "and " + enemy.getName() + " has " + enemy.getHealth() + " HPs");

      player.attack(enemy);
      if (!enemy.isAlive()) {
        break;
      }

      enemy.attack(player);
      if (!player.isAlive()) {
        break;
      }
    }

    if (player.isAlive()) {
      System.out.printf("You defeated the %s!%n", enemy.getName());
    } else {
      System.out.printf("You've been defeated by %s...%n", enemy.getName());
    }
  }
}
