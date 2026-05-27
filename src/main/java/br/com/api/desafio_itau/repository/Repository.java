package br.com.api.desafio_itau.repository;

import br.com.api.desafio_itau.model.Transaction;


import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    private final List<Transaction> transactions;

    public Repository() {
        this.transactions = new ArrayList<>();
    }

    public Transaction save(Transaction transaction) {
        this.transactions.add(transaction);
        return transaction;
    }

    public List<Transaction> findAll() {
        return List.copyOf(transactions);
    }
}
