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
    private int iva;
    private ArrayList<Menu> listaMenu;
    private double valorCancelar;
    private double subtotal;

    public Cuenta(String n, int i, ArrayList<Menu> listaM) {
        nombreCliente = n;
        iva = i;
        listaMenu = listaM;
    }

    public void establecerNombreCliente(String c) {
        this.nombreCliente = c;
    }

    public void establecerIva(int c) {
        this.iva = c;
    }

    public void establecerListaMenu(ArrayList<Menu> c) {
        this.listaMenu = c;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < listaMenu.size(); i++) {
            subtotal += listaMenu.get(i).valorMenu;
        }
    }
    public void establecerValorCancelar() {
        valorCancelar = subtotal + (subtotal*(iva/100));
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public int obtenerIva() {
        return iva;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listaMenu;
    }
    public double obtenerSubtotal() {
        return subtotal;
    }
    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre del cliente: %s\n"
                + "Iva: %.2f\n"
                + "Lista Menu: %.2f\n"
                + "Subtotal: %.2f"
                + "valor a Cancelar: %.2f\n", 
                obtenerNombreCliente(),
                obtenerIva(),
                obtenerListaMenu(),
                obtenerSubtotal(),
                obtenerValorCancelar());
        return cadena;
    }
}
