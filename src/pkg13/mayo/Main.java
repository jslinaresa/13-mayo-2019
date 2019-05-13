/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.mayo;

/**
 *
 * @author jslinaresa
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro("123","446");
        animal.hacersonido();
        animal.corre();
                
        Gato gato = new Gato("miau","567");
        gato.hacersonido();
        gato.corre();
                
    }
 
    
}
