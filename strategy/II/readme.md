# Strategy Pattern Example

This project is an implementation of the Strategy Design Pattern. It simulates a simple game in which the player and the enemy can attack each other using different attack strategies, such as physical, fire, and ice attacks.

## Usage
To run this project you need to compile the `Game.java` and run the binary.

```bash
  $ javac src/main/java/game/Game.java
  $ java src/main/java/game/Game
```

The game will prompt you to select an attack strategy for the player, which can be either a physical, fire, or ice attack. The enemy's attack strategy is hard coded based on the creature type.

Once the game starts, the player and enemy will take turns attacking each other until one of them is defeated. The game will then display a message indicating whether the player has won or lost.

## Class Diagram

![Diagrama PlantUML](https://github.com/gabriel-fabian/bertoti/assets/61850709/0fb62aff-b309-4dd7-ba51-8f4144900df4)
