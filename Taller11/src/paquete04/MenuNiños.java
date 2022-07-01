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

    public MenuNiños(String n,double valorI,double vH, double vP) {
        super(n, valorI);
        valorHelado = vH;
        valorPastel = vP;
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
        String cadena = String.format("Menu Niños"
                + "Nombre Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n"
                + "Valor del Helado: %.2f\n"
                + "Valor del Pastel: %.2f"
                + "valor total a Cancelar: %.2f\n", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenertValorMenu());
        return cadena;
    }
}
