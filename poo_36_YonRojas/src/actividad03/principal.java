/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad03;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        auto auto1 = new auto();
        auto1.color = "rojo";
        auto1.placa = 1234;
        String color = auto1.colrA();
        int placa = auto1.info();
        System.out.println("la placa es: "+ placa);
        System.out.println("el color es: "+ color);
                
    }
    
}
