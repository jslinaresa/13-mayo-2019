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
public abstract class Animal {
    // no tiene el main
    
 protected String nombre;   
 protected String raza; 

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    public abstract void hacersonido();// metodo anstracto
    public abstract void corre();{
            System.out.println("Corriendo");// metodo fijo
}
}
