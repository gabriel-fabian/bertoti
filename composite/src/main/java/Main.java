package src.main.java;

import java.util.Scanner;

import src.main.java.validators.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type an string between 5 and 10 characters.");
    String input = scanner.nextLine();
    scanner.close();

    Validator stringValidator = new StringValidator(input);
    Validator maxLengthValidator = new MaxLengthValidator(input, 10);
    Validator minLengthValidator = new MinLengthValidator(input, 5);

    // Compose a validator for input
    ValidatorComposite validationComposite = new ValidatorComposite();
    validationComposite.addValidator(stringValidator);
    validationComposite.addValidator(maxLengthValidator);
    validationComposite.addValidator(minLengthValidator);

  try {
    // Run validators
    validationComposite.validate();
    System.out.println("Valid Input");
  } catch (ValidationException e) {
    System.out.println("Validation error: " + e.getMessage());
  }
  }
}
