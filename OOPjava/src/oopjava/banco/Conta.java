package oopjava.banco;

import java.util.Random;

public class Conta {

    private int numero;
    private Pessoa titular;
    private double saldo;
    private int gerarNumConta;

    public Conta(Pessoa titular) {

        this.titular = titular;
        this.saldo = 0.0;
        // this.numero =  this.gerarNumConta();
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    private int gerarNumConta() {
        Random random = new Random();
        return random.nextInt(90000) + 100000;

    }

}
