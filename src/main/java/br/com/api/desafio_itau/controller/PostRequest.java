package br.com.api.desafio_itau.controller;

import br.com.api.desafio_itau.model.TransactionDTO;

import br.com.api.desafio_itau.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class PostRequest {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public void send (@RequestBody TransactionDTO transactionDTO){
         transactionService.save(transactionDTO);
    }



}
