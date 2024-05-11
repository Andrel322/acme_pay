package br.com.acmepay.application.domains.exceptions;

public class BalanceWithdrawException extends Exception {
    public BalanceWithdrawException(String message) {
        super(message);
    }
}
