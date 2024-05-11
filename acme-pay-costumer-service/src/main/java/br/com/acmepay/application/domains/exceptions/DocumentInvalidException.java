package br.com.acmepay.application.domains.exceptions;

public class DocumentInvalidException extends Exception {
    public DocumentInvalidException(String message) {
        super(message);
    }
}
