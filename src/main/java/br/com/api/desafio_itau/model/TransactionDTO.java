package br.com.api.desafio_itau.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record TransactionDTO(BigDecimal value, OffsetDateTime dateTime ) {
}
