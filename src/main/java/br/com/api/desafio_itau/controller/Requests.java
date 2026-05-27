package br.com.api.desafio_itau.controller;

import br.com.api.desafio_itau.model.Transaction;

import br.com.api.desafio_itau.service.TransactionService;
import br.com.api.desafio_itau.statistics.Statistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class Requests {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction send (@RequestBody Transaction transaction){
        return transactionService.save(transaction);
    }

    @GetMapping
    public ResponseEntity<Statistics> read() {

        Statistics stats = transactionService.result();
        return ResponseEntity.ok(stats); }

}
