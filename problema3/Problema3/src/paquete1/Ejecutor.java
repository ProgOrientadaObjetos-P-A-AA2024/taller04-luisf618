/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Automotor;

/**
 *
 * @author lcord
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotor a1 = new Automotor("1105958803", "Daewo", 2001, 8000);
        Automotor a2 = new Automotor("1105958795", "Hyundai", 18500);
        a1.calcularValorMatricula();
        a2.calcularValorMatricula();

        System.out.printf("%s\n----------------------------------\n%s\n", 
                a1, a2);
    }

}
