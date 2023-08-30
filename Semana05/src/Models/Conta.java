package Models;

import java.util.Random;
import java.util.UUID;

public class Conta {

    public Conta(Pessoa titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.id = UUID.randomUUID();
        this.numero = this.gerarNumeroConta();
    }

    public Conta(int numero, double saldo, Pessoa titular, UUID id) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.id = id;
    }
    
   

    private int numero;
    double saldo;
    private Pessoa titular;
    private UUID id;

    public UUID getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(Conta destinatario, double valor) {

        this.saldo -= valor;
        destinatario.saldo += valor;

    }

    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }

   
  

}
