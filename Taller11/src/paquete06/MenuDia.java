/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;
import paquete02.Menu;
/**
 *
 * @author spart
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nom, double valorI, double vp, double vb) {
        super(nom, valorI);
        valorPostre = vp;
        valorBebida = vb;
    }

    public void establecerValorPostre(double c) {
        valorPostre = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia"
                + "Nombre Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n"
                + "Valor de la Porcion: %.2f\n"
                + "Valor de la Bebida: %.2f"
                + "Valor adicional: %.2f\n"
                + "valor Total a Cancelar: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorBebida(),
                obtenertValorMenu());
        return cadena;
    }
}
