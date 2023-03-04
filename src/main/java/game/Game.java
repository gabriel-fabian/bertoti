package src.main.java.game;

import java.util.HashMap;
import java.util.Scanner;

import src.main.java.game.characters.Enemy;
import src.main.java.game.characters.Player;
import src.main.java.game.strategies.AttackStrategy;
import src.main.java.game.strategies.PhysicalAttackStrategy;

public class Game {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Type character name: ");
    String playerName = input.nextLine();

    // Move to factory creation
    Player player = new Player(playerName, 100, new HashMap<String, Integer>(), new HashMap<String, Integer>(), new PhysicalAttackStrategy());
    Enemy enemy = new Enemy("Goblin", 50, new HashMap<String, Integer>(), new HashMap<String, Integer>(), new PhysicalAttackStrategy());

    // Hard coded damages and resistances to make player win.
    player.setDamage("PHYSICAL", 10);
    player.setResistance("PHYSICAL", 10);

    enemy.setDamage("PHYSICAL", 5);
    enemy.setResistance("PHYSICAL", 5);

    AttackStrategy strategy = new PhysicalAttackStrategy();
    player.setAttackStrategy(strategy);

    boolean gameOver = false;
    while (!gameOver) {
        System.out.println(player.getName() + " has " + player.getHealth() + " HP.");
        System.out.println(enemy.getName() + " tem " + enemy.getHealth() + " HP.");

        player.attack(enemy);

        if (!enemy.isAlive()) {
            System.out.println(enemy.getName() + " was defeated!");
            gameOver = true;
            break;
        }

        enemy.attack(player);

        if (!player.isAlive()) {
            System.out.println(player.getName() + " was defeated!");
            gameOver = true;
            break;
        }
    }

    input.close();
    System.out.println("Game Over!.");
  }
}
