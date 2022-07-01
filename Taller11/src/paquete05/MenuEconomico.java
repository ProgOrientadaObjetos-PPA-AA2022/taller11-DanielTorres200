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
    private int descuento;

    public MenuEconomico(String n,double valorI,int desc) {
        super(n, valorI);
        descuento = desc;
    }

    public void establecerDescuento(int d) {
        descuento = d;
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial*(descuento/100));
    }
    public int obtenerDescuento() {
        return descuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu Economico"
                + "Nombre Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n"
                + "Valor del descuento: %.2f\n"
                + "valor Total a Cancelar: %.2f\n", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerDescuento(),
                obtenertValorMenu());
        return cadena;
    }
}
