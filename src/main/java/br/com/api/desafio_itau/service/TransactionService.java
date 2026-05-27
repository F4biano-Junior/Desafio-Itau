package br.com.api.desafio_itau.service;

import br.com.api.desafio_itau.model.Transaction;

import br.com.api.desafio_itau.repository.Repository;
import br.com.api.desafio_itau.statistics.Statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private Repository repository;

    public TransactionService(Repository repository) {this.repository = repository; }


    public Transaction save(Transaction transaction){
        return repository.save(transaction);
    }


    public Statistics result (){

        List<Transaction> transactions = repository.findAll();

        return Statistics.calculate(transactions);
    }
}
