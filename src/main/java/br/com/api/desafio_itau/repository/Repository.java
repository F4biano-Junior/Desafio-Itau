package br.com.api.desafio_itau.repository;


import br.com.api.desafio_itau.model.Transaction;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@org.springframework.stereotype.Repository
public class Repository {
    private final List<Transaction> transactions = new CopyOnWriteArrayList<>();

    public void save(Transaction transaction) {
        transactions.add(transaction);

    }

    public List<Transaction> getAll() {
        return List.copyOf(transactions);
    }
}
