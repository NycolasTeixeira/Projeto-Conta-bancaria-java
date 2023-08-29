
package oopjava.banco;


public class Pessoa {
    
private String nome;
private String RG;
private String cpf;
private String cnpj;
private String numero;
private String endereco;
private String email;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.RG = RG;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.numero = numero;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getRG() {
        return RG;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNumero() {
        return numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }


   private boolean validaCpf(String cpf){
       return true;
   }








}
