package creditlimitapp.model;

import java.math.BigDecimal;
import lombok.Value;

@Value
public class CreditLimit {

  BigDecimal lowerAmountLimit;
  BigDecimal upperAmountLimit;
}
