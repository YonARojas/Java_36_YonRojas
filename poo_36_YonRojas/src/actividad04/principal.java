/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circulo circulo1 = new circulo();
        circulo1.radio = 5;
        circulo1.color = "Rojo";
        
        double area = circulo1.calcularArea(3.14);
        System.out.println("Área del círculo: " + area);
        circulo1.cambiarColor("Azul");
    }
    
}
