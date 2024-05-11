package br.com.acmepay.application.domains.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDomain {
    private long id;

    private LocalDateTime dataTransaction;

//    private AccountDomain sourceAccount;

//    private AccountDomain destinationAccount;

    private BigDecimal amount;
}
