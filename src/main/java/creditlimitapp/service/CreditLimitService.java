package creditlimitapp.service;

import static java.math.BigDecimal.valueOf;

import creditlimitapp.configuration.CreditLimitConfig;
import creditlimitapp.model.CreditLimit;
import creditlimitapp.model.CreditLimitRequest;
import creditlimitapp.model.CreditLimitResult;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditLimitService {

  private final CreditLimitConfig config;

  public CreditLimit getLimits() {
    return new CreditLimit(config.getLowerLimit(), config.getUpperLimit());
  }

  public CreditLimitResult calculateLoanLimit(CreditLimitRequest creditLimitRequest) {
    // Todo: We are a simple beginner bank who need to provide loans for customers. We need a mechanism to ajust
    //  the customers loan request by the factor of how good is their credit history.
    //  Implement simple scoring algorithm where requested amount is multiplied by credit score modifier
    // Todo: implement an easter egg that when result is bigger than 9000 its logged differently
    validateLoanAmountInLimits(creditLimitRequest.getAmount());
    return new CreditLimitResult(valueOf(1000L));
  }

  private void validateLoanAmountInLimits(BigDecimal loanAmount) {
    // Todo: validate that the loan amount is within limits. Throw error is its not.
  }
}
