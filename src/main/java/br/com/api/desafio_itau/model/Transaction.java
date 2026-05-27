package br.com.api.desafio_itau.model;


import java.math.BigDecimal;

import java.time.OffsetDateTime;

public record Transaction(BigDecimal value, OffsetDateTime dateTime) {

    public Transaction {
        if (value == null || value.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("A transação não pode ser negativa!");
        }

        if (dateTime != null && dateTime.isAfter(OffsetDateTime.now())) {
            throw new RuntimeException("A transação não pode ser realizada no futuro");
        }
    }
}
