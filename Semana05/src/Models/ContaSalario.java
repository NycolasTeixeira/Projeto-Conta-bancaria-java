package Models;

import java.util.UUID;

public class ContaSalario extends Conta {

    public ContaSalario(int numero, double saldo, Pessoa titular, UUID id) {
        super(numero, saldo, titular, id);
    }
    
    
    
    
    
    public ContaSalario(Pessoa titular) {
        super(titular);
    }    
    
}
