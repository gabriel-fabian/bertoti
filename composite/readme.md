# Composite Design Pattern

This project is an implementation of the Composite Design Pattern. It demonstrates how to use the Composite pattern to validate input data using multiple validators.

## Usage
To run this project, you need to compile the Main.java file and run the binary.

```bash
  $ javac src/main/java/Main.java
  $ java src/main/java/Main
```

The program will prompt you to enter a string input. It will then validate the input using three validators: StringValidator, MaxLengthValidator, and MinLengthValidator.

The StringValidator ensures that the input is a string. The MaxLengthValidator checks if the input length is within the specified maximum length. The MinLengthValidator verifies if the input length is above the specified minimum length.

If the input passes all the validators, the program will display a message indicating that the input is valid. If any of the validators fail, a ValidationException will be thrown with an appropriate error message.

## Class Diagram

![Diagrama PlantUML](https://github.com/gabriel-fabian/bertoti/assets/61850709/36fcf31b-f954-4bec-85a3-d533af26f50e)
