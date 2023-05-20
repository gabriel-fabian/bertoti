# Singleton Design Pattern

This project is an implementation of the Singleton Design Pattern. It demonstrates how to create a class that ensures only one instance is created and provides a global point of access to that instance.

## Usage
To run this project, you need to compile the Main.java file and run the binary.

```bash
  $ javac src/main/java/Main.java
  $ java src/main/java/Main
```

The program showcases the usage of the Singleton pattern with a Logger class. The Logger class ensures that only one instance of the logger is created throughout the application. Multiple calls to Logger.getInstance() will return the same instance, providing a centralized logging mechanism.

## Class Diagram

![Diagrama PlantUML](https://github.com/gabriel-fabian/bertoti/assets/61850709/7351dd19-ba5c-4807-9ea8-c331dc58d308)
