/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author lcord
 */
public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valor;
    private double comision;

    public Cheque(String c, String b, double v) {
        nombreCliente = c;
        nombreBanco = b;
        valor = v;
    }

    public Cheque(String c, double v) {
        nombreCliente = c;
        nombreBanco = "Banco de Loja";
        valor = v;
    }

    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }

    public void establcerNombreBanco(String x) {
        nombreBanco = x;
    }

    public void establecerValor(double x) {
        valor = x;
    }

    public void calcularComision() {
        comision = valor * (0.003 / 100);
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: $%.2f\n"
                + "Comision que cobra el banco: $%.2f\n", nombreCliente,
                nombreBanco, valor, comision);
        return cadena;
    }

}
