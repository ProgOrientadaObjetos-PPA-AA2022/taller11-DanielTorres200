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

    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNiños(String nom, double valorI, double vh, double vp) {
        super(nom, valorI);
        valorPorcionHelado = vh;
        valorPorcionPastel = vp;
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
        String cadena = String.format("Menu Niños\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor sillas: %.2f\n"
                + "Valor amplificacion: %.2f\n"
                + "Arriendo Total: %.2f\n",
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorSillas(),
                obtenerValorAmplificacion(),
                obtenerArriendoMensual());

        return cadena;
    }
}
