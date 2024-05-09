/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete2.Cheque;

/**
 *
 * @author lcord
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheque c1 = new Cheque("Juan Cordova", "Banco Pichincha", 100000);
        Cheque c2 = new Cheque("Luis Cordova", 150000);
        c1.calcularComision();
        c2.calcularComision();

        System.out.printf("%s\n-----------------------------------\n%s\n",
                c1, c2);
    }

}
