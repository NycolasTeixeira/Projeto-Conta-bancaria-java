package oopjava;

import java.util.ArrayList;

public class OOPjava {

    public static void main(String[] args) {

        ArrayList<Dog> listaCaes = new ArrayList<>();
        
        
        Dono dono1 = new Dono("maçaneiro", "xxxx-xxxx", "Rua tal, nº aquele");
        
        
        
        
        Dog cachorro1 = new Dog("Bob", "pincher", 3, "pequeno", dono1);

        System.out.println(cachorro1.getNome());
        
        Dog cachorro2 = new Dog("Docinho", "pitbull", 3, "grande", dono1);
    
    
       listaCaes.add(cachorro1);
       
       listaCaes.add(cachorro2);
  
    
   
        
       
    
    }



}
