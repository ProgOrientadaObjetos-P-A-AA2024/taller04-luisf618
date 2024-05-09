/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author lcord
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesores(String n, String a, double s, String c) {
        nombre = n;
        apellido = a;
        sueldoBasico = s;
        cedula = c;
    }

    public Profesores(String n, String a, String c) {
        nombre = n;
        apellido = a;
        sueldoBasico = 455.50;
        cedula = c;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerSueldoBasico(double x) {
        sueldoBasico = x;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: $%.2f\n"
                + "Sueldo Total: $%.2f\n"
                + "Cedula: %s\n", nombre, apellido, sueldoBasico,
                sueldoTotal, cedula);
        return cadena;
    }
}
