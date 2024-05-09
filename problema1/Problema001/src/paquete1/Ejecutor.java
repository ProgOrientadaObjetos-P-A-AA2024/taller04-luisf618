/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.LibretaNotas;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        LibretaNotas libreta1 = new LibretaNotas("Luis Fernando Cordova",
                10, 9.8, 8.9);
        LibretaNotas libreta2 = new LibretaNotas("Juan DIego Cordova",
                9.5, 9);
        libreta1.CalcularPromedio();
        libreta2.CalcularPromedio();

        System.out.printf("%s\n--------------------\n%s\n", libreta1, libreta2);
    }
}
