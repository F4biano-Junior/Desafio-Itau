package br.com.api.desafio_itau.controller;

import br.com.api.desafio_itau.DTO.RequestStatistics;
import br.com.api.desafio_itau.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatisticas")
public class StatisticsRequest {
    private final TransactionService transactionService;

    private  StatisticsRequest(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<RequestStatistics> read() {
        RequestStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(stats); }
}
