/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author spart
 */
public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> menus = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;
    private double iva;

    public Cuenta(String n, ArrayList<Menu> menus) {
        nombreCliente = n;
        menus = lista;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerMenus(ArrayList<Menu> lista) {
        Menu = lista;
    }

    public void establecerTotalArriendosFinalMensual() {
        for (int i = 0; i < obtenerArriendos().size(); i++) {
            totalArriendosFinalMensual = totalArriendosFinalMensual
                    + obtenerArriendos().get(i).obtenerArriendoMensual();
        }
    }

    public void establecerTotalArriendosBaseMensual() {
        for (int i = 0; i < obtenerArriendos().size(); i++) {
            totalArriendosBaseMensual = totalArriendosBaseMensual
                    + obtenerArriendos().get(i).obtenerCuotaBase();
        }
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Arriendo> obtenerArriendos() {
        return arriendos;
    }

    public double obtenerTotalArriendosFinalMensual() {
        return totalArriendosFinalMensual;
    }

    public double obtenerTotalArriendosBaseMensual() {
        return totalArriendosBaseMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Centro Comercial\n"
                + "Nombre: %s\n"
                + "Lista de Locales\n\n", obtenerNombre());

        for (int i = 0; i < obtenerArriendos().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerArriendos().get(i));
        }

        cadena = String.format("\n%sTotal Arriendos base Mensual: %.2f\n"
                + "Total Arriendos Mensual: %.2f\n",
                cadena,
                obtenerTotalArriendosBaseMensual(),
                obtenerTotalArriendosFinalMensual());
        return cadena;
    }
}
