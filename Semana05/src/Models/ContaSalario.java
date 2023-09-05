package Models;

import java.util.UUID;

public class ContaSalario extends Conta {

    public ContaSalario(int numero, double saldo, Pessoa titular, UUID id, String senha) {
        super(numero, saldo, titular, id, senha);
    }
    
    
    
    
    
    public ContaSalario(Pessoa titular, String senha) {
        super(titular, senha);
    }    
    
}
