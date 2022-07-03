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

    public Cuenta(String nom, int i, ArrayList<Menu> listaM) {
        nombreCliente = nom;
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
        valorCancelar = subtotal + (subtotal*(iva)/100);
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIva() {
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
    public String toString(){
        String cadena = String.format("Factura\n"
                + "Cliente: %s",
                obtenerNombreCliente());
        
        for (int i = 0; i < listaMenu.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, listaMenu.get(i));
        }
        cadena = String.format("%sSubtotal: %.1f\n"
                + "IVA: %.1f\n" 
                + "Total a pagar: %.3f",
                cadena,
                obtenerSubtotal() ,
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }
}
