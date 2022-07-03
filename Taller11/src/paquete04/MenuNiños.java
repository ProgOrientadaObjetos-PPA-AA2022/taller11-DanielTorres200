/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Menu;

/**
 *
 * @author spart
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String n,double valorI,double valorH, double valorP) {
        super(n, valorI);
        valorHelado = valorH;
        valorPastel = valorP;
    }

    public void establecerValorHelado(double c) {
        valorHelado = c;
    }

    public void establecerValorPastel(double c) {
        valorPastel = c;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorHelado+ valorPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Niños\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del Menu: %.2f\n"
                + "\tValor Helado: %.2f\n"
                + "\tValor Pastel: %.2f\n"
                + "\tvalor del Menu: %.2f", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenertValorMenu());
        return cadena;
    }
}
