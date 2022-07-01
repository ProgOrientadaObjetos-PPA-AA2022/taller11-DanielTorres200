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

    public MenuCarta(String nom, double valorI, double vp, double vb, double va) {
        super(nom, valorI);
        valorPorcionGuarnicio = vp;
        valorBebida = vb;
        valorAdicional = va;
    }

    public void establecerValorPorcion(double c) {
        valorPorcionGuarnicio = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
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
        String cadena = String.format("Menu Carta"
                + "Nombre Plato: %s\n"
                + "Valor inicial del Menu: %.2f\n"
                + "Valor Porcion: %.2f\n"
                + "Valor Bebida: %.2f"
                + "Valor adicional: %.2f\n"
                + "valor total a Cancelar: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorPorcion(),
                obtenerValorBebida(),
                obtenerValorAdicional(),
                obtenertValorMenu());
        return cadena;
    }
}