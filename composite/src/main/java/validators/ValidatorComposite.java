package src.main.java.validators;

import java.util.ArrayList;
import java.util.List;

public class ValidatorComposite implements Validator {
  private List<Validator> validators = new ArrayList<>();

  public void addValidator(Validator validator) {
    validators.add(validator);
  }

  @Override
  public void validate() {
    for (Validator validator: validators) {
      validator.validate();
    }
  }
}
