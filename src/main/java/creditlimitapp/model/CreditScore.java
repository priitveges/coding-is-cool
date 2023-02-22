package creditlimitapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CreditScore {

  BAD(0.1),
  GOOD(1.0),
  EXCEPTIONAL(2.0);

  private final Double mofifier;
}
