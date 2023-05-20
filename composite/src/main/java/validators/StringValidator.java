package src.main.java.validators;

public class StringValidator implements Validator {
  private Object input;

  public StringValidator(Object input) {
    this.input = input;
  }

  @Override
  public void validate() {
    if (!(input instanceof String)) {
      throw new ValidationException("Input is not an string");
    }
  }
}
