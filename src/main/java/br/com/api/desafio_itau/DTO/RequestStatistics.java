package br.com.api.desafio_itau.DTO;

import br.com.api.desafio_itau.model.Transaction;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public record RequestStatistics(
        long count,
        BigDecimal sum,
        BigDecimal avg,
        BigDecimal min,
        BigDecimal max) {

    public static RequestStatistics calculate(List<Transaction> transactions){
        //tratamento para lista vazia evita divisão por zero
        if (transactions == null || transactions.isEmpty()){
            return new RequestStatistics(0, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO);
        }
        //inicia as variaveis pra não ficarem nulas
        int count = 0;
        BigDecimal sum = BigDecimal.ZERO;

        // pega a primeira transação da lista
        BigDecimal min = transactions.get(0).getValue();
        BigDecimal max = transactions.get(0).getValue();

        for (Transaction t : transactions) {
            BigDecimal currentValue = t.getValue();

            count++;

            sum = sum.add(currentValue);

            //compara as transações até achar a menor
            if (currentValue.compareTo(min) < 0) {
                min = currentValue;
            }
            //compara até achar a maior
            if (currentValue.compareTo(max) > 0) {
                max = currentValue;
            }
        }

        // calcula a média usando o contador como divisor e dividendo
        BigDecimal divider = BigDecimal.valueOf(count);
        BigDecimal avg = sum.divide(divider, 2, RoundingMode.HALF_UP);


        return new RequestStatistics(count, sum, avg, min, max);
    }
}