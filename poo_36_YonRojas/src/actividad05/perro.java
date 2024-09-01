/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad05;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class perro {

    String nombre;
    String raza;
    
    public perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
     public void mostrarInformacion() {
        System.out.println("Nombre del perro: " + nombre);
        System.out.println("Raza del perro: " + raza);
    }

}
