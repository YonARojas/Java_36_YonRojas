/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class Persona {
    
    String nombre;
    int edad;
    
    public void hablar(){
        System.out.print(nombre+" dice hola");
        
    }
    public void orden(){
        System.out.println(nombre+" levantar la mano");
    }
}
