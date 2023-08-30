package Models;

import java.util.UUID;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo, Pessoa titular, UUID id) {
        super(numero, saldo, titular, id);
    }
    
    public ContaPoupanca(Pessoa titular) {
        super(titular);
    } 
}

