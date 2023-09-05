package Models;

import java.util.UUID;



public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo, Pessoa titular, UUID id, String senha) {
        super(numero, saldo, titular, id, senha);
    }
    
   
    
    public ContaCorrente(Pessoa titular, String senha) {
        super(titular, senha);
    } 

    
    
    
    
    
    
    
    
    
    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - (valor + (this.saldo * 0.10));
    }
     
}
