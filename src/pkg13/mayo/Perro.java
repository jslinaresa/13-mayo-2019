/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.mayo;


public class Perro extends Animal{

    public Perro(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    public void hacersonido() {
        System.out.println("Guauu...");
    }

    @Override
    public void corre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
