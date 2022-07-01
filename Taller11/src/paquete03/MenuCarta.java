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

    private double valorPorcion;
    private double valorBebida;
    private double valorAdicional;

    public MenuCarta(String nom, double valorI, double vp, double vb, double va) {
        super(nom, valorI);
        valorPorcion = vp;
        valorBebida = vb;
        valorAdicional = va;
    }

    public void establecerValorPorcion(double c) {
        valorPorcion = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }

    public void establecerValorAdicional() {
        valorAdicional = ((valorInicial) * valorAdicional / 100);
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPorcion + valorBebida + ((valorInicial) * valorAdicional / 100);
    }

    public double obtenerValorPorcion() {
        return valorPorcion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta"
                + "Nombre Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n"
                + "Valor de la Porcion: %.2f\n"
                + "Valor de la Bebida: %.2f"
                + "Valor adicional: %.2f\n"
                + "valor Total a Cancelar: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorPorcion(),
                obtenerValorBebida(),
                obtenerValorAdicional(),
                obtenertValorMenu());
        return cadena;
    }
}