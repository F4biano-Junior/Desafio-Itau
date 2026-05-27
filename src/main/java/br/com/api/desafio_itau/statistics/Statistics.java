package br.com.api.desafio_itau.statistics;

public record Statistics(
        int count,
        double sum,
        double avg,
        double min,
        double max) {

    public Statistics(int count, double sum, double avg, double min, double max) {
        this.count = count;
        this.sum = sum;
        this.avg = avg;
        this.min = min;
        this.max = max;
    }
}
