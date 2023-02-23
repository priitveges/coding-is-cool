package creditlimitapp.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.status;

import creditlimitapp.model.CreditLimit;
import creditlimitapp.model.CreditLimitRequest;
import creditlimitapp.model.CreditLimitResult;
import creditlimitapp.service.CreditLimitService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/credit-score", produces = APPLICATION_JSON_VALUE)
public class CreditLimitController {

  private final CreditLimitService service;

  @ResponseStatus(OK)
  @GetMapping("/limit")
  @Operation(summary = "Get identifications by document number and type", method = "GET")
  public ResponseEntity<CreditLimit> getLimits() {
    // Todo: You found the way to access the banks code. Lets see if you can hack the system
    //  and change the limits available for the customers.
    return status(OK).body(service.getLimits());
  }

  @ResponseStatus(CREATED)
  @PostMapping("/calculate")
  @Operation(summary = "Calculate the limit based on the credit score", method = "POST")
  public ResponseEntity<CreditLimitResult> getPersonLimit(@RequestBody CreditLimitRequest creditLimitRequest) {
    log.info("Calculating person's loan limit");
    return status(CREATED).body(service.calculateLoanLimit(creditLimitRequest));
  }
}
