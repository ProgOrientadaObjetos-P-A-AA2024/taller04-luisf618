/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author lcord
 */
public class Automotor {

    private String cedula;
    private String marca;
    private int year;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String c, String m, int y, double v) {
        cedula = c;
        marca = m;
        year = y;
        valorVehiculo = v;
    }

    public Automotor(String c, String m, double v) {
        cedula = c;
        marca = m;
        year = 2015;
        valorVehiculo = v;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerYear(int x) {
        year = x;
    }

    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }

    public void calcularValorMatricula() {
        valorMatricula = ((0.002 / 100) * valorVehiculo) * (2024 - year);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerYear() {
        return year;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Año de Fabricacion: %d\n"
                + "Valor del Vehiculo: $%.2f\n"
                + "Valor de la Matricula: $%.2f\n", cedula, marca,
                year, valorVehiculo, valorMatricula);
        return cadena;
    }

}
