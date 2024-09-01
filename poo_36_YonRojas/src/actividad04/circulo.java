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
public class circulo {
    
    double radio;
    String color;

    public double calcularArea(double pi) {
        return pi * radio * radio;
    }
    
    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El color del círculo ahora es " + color);
    }
}
