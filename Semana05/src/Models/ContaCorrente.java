package Models;

import java.util.UUID;



public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo, Pessoa titular, UUID id) {
        super(numero, saldo, titular, id);
    }
    
   
    
    public ContaCorrente(Pessoa titular) {
        super(titular);
    } 

    
    
    
    
    
    
    
    
    
    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - (valor + (this.saldo * 0.10));
    }
     
}
