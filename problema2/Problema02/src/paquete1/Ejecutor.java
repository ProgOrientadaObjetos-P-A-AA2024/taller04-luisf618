/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Profesores;

/**
 *
 * @author lcord
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesores p1 = new Profesores("Luis", "Cordova", 550.5,
                "1105958829");
        Profesores p2 = new Profesores("Juan", "Cordova", "1102989009");
        p1.calcularSueldoTotal();
        p2.calcularSueldoTotal();

        System.out.printf("%s\n----------------------------------\n%s\n", 
                p1, p2);
    }

}
