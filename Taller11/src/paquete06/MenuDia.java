/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author spart
 */
public class MenuDia {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    protected double valorPorcionGuarnicion;
    protected double valorBebida;
    protected double porcentajeAdicionalServicio;
    
    public void establecerNombrePlato(String x){
        nombrePlato = x;
    }
    
    public void establecerValorMenu(double x){
        valorMenu = x;
    }
    
    public void establecerValorInicial(double n){
        valorInicial = n;
    }
    
    public double establecerValorPorcionGuarnicion(double v){
        valorPorcionGuarnicion = v;
    }
    
    public void establecerValorBebida(double b){
        valorBebida = b;
    }
    
    public double obtenerPorcentajeAdicionalServicio(double p){
        porcentajeAdicionalServicio = p;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu a la Carta\n"
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
