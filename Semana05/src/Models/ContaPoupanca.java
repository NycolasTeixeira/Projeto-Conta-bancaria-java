package Models;

import java.util.UUID;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo, Pessoa titular, UUID id, String senha) {
        super(numero, saldo, titular, id, senha);
    }
    
    public ContaPoupanca(Pessoa titular, String senha) {
        super(titular, senha);
    } 
}

