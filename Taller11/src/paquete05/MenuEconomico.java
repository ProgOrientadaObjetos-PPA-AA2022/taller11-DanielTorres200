/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;
import paquete02.Menu;
/**
 *
 * @author spart
 */
public class MenuEconomico extends Menu {
    private double descuento;

    public MenuEconomico(String n,double valorI,double desc) {
        super(n, valorI);
        descuento = desc;
    }

    public void establecerDescuento(double d) {
        descuento = d;
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial*(descuento/100));
    }
    public double obtenerDescuento() {
        return descuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menu: %.2f", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerDescuento(),
                obtenertValorMenu());
        return cadena;
    }
}
