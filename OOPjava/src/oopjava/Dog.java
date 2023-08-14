/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopjava;

/**
 *
 * @author nycolas_teixeira
 */
public class Dog {

    private String nome;
    private String raca;
    private int idade;
    private String porte;
    private Dono dono;
   
    
    
    public Dog(String nome, String raca, int idade, String porte, Dono dono) {

        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getPorte() {
        return porte;
    }

    public Dono getDono() {
        return dono;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

}
