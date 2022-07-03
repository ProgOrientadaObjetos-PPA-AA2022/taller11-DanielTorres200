/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author spart
 */
public class MenuCarta extends Menu {
    private double valorPorcionGuarnicio;
    private double valorBebida;
    private double valorAdicional;

    public MenuCarta(String nom, double valorI, double vPG, double vB, double vA) {
        super(nom, valorI);
        valorPorcionGuarnicio = vPG;
        valorBebida = vB;
        valorAdicional = vA;
    }

    public void establecerValorPorcion(double c) {
        valorPorcionGuarnicio = c;
    }

    public void establecerValorBebida(double b) {
        valorBebida = b;
    }

    public void establecerValorAdicional() {
        valorAdicional = ((valorInicial) * valorAdicional / 100);
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPorcionGuarnicio + valorBebida + ((valorInicial) * valorAdicional / 100);
    }

    public double obtenerValorPorcion() {
        return valorPorcionGuarnicio;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta\n"
                + "\tPlato: %s\n"
                + "\tValor inicial del Menu: %.1f\n"
                + "\tValor Guarnicion: %.1f\n"
                + "\tValor Bebida: %.1f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tvalor del Menu: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorPorcion(),
                obtenerValorBebida(),
                obtenerValorAdicional(),
                obtenertValorMenu());
        return cadena;
    }
}