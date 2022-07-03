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

    public MenuDia(String nom, double valorI, double vP, double vB) {
        super(nom, valorI);
        valorPostre = vP;
        valorBebida = vB;
    }

    public void establecerValorPostre(double p) {
        valorPostre = p;
    }

    public void establecerValorBebida(double b) {
        valorBebida = b;
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
        String cadena = String.format("Menu del Dia\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor Helado: %.2f\n"
                + "\tValor Pastel: %.2f\n"
                + "\tvalor Menu: %.2f", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenertValorMenu());
        return cadena;
    }
}
