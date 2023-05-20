package src.main.java.validators;

public class MinLengthValidator implements Validator {
  private String input;
  private int minLength;

  public MinLengthValidator(String input, int minLength) {
    this.input = input;
    this.minLength = minLength;
  }

  @Override
  public void validate() {
    if (input.length() < minLength) {
      throw new ValidationException("Input is less than minimun length.");
    }
  }
}
