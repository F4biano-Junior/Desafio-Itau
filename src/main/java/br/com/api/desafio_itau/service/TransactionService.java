package br.com.api.desafio_itau.service;

import br.com.api.desafio_itau.model.Transaction;

import br.com.api.desafio_itau.repository.Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private Repository repository;

    public TransactionService(Repository repository) {this.repository = repository; }

    @Transactional
    public Transaction save(Transaction transaction){
        return repository.save(transaction);
    }
}
