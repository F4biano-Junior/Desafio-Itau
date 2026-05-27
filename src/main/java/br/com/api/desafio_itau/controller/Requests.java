package br.com.api.desafio_itau.controller;

import br.com.api.desafio_itau.model.Transaction;

import br.com.api.desafio_itau.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class Requests {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction send (@RequestBody Transaction transaction){
        return transactionService.save(transaction);
    }

}
