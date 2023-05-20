package src.main.java;

public class Main {
  public static void main(String[] args) {
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();

    // Will output true since the Singleton is applied
    System.out.println("Logger instances are the same?: " + (logger1 == logger2));

    logger1.log("Some info message");
    logger2.log("Another info message");
  }
}
