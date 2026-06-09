package br.com.api.desafio_itau.model;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transaction {
    private final BigDecimal value;
    private final OffsetDateTime dateTime;

    public Transaction(TransactionDTO dados) {
        if (dados.dateTime() != null && dados.dateTime().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("A transação não pode ser realizada no futuro");
        }
        if (dados.value() == null ||  dados.value().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("A Transação não pode ser nula ou menor que zero");
        }

        this.value = dados.value();
        this.dateTime = dados.dateTime();
    }

    public BigDecimal getValue() {
        return value;
    }

}
