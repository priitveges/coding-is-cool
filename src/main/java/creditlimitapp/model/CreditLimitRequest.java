package creditlimitapp.model;

import java.math.BigDecimal;
import lombok.Value;

@Value
public class CreditLimitRequest {

  BigDecimal amount;
  CreditScore creditScore;
}
