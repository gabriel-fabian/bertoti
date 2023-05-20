package src.main.java.validators;

public class MaxLengthValidator implements Validator {
  private String input;
  private int maxLength;

  public MaxLengthValidator(String input, int maxLength) {
    this.input = input;
    this.maxLength = maxLength;
  }

  @Override
  public void validate() {
    if (input.length() > maxLength) {
      throw new ValidationException("Input is above the maximum length.");
    }
  }
}
