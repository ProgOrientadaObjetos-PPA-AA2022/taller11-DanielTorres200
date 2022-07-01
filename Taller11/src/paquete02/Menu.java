/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author spart
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String n, double vi) {
        nombrePlato = n;
        valorInicial = vi;
    }

    public void establecerNombrePlato(String c) {
        nombrePlato = c;
    }

    public abstract void calcularValorMenu();

    public void establecerValorInicial(double c) {
        valorInicial = c;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenertValorInicial() {
        return valorInicial;
    }

    public double obtenertValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta\n"
                + "Nombre Plato: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor sillas: %.2f\n"
                + "Valor amplificacion: %.2f\n"
                + "Arriendo Total: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenertValorMenu());

        return cadena;
    }
}
