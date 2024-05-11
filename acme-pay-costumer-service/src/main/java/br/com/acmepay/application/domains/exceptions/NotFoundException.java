package br.com.acmepay.application.domains.exceptions;

public class NotFoundException extends Exception {
    public NotFoundException(String message) {
        super(message);
    }
}
