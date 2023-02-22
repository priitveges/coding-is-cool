package creditlimitapp.configuration;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "credit-limit")
public class CreditLimitConfig {

  private BigDecimal upperLimit;
  private BigDecimal lowerLimit;
}
