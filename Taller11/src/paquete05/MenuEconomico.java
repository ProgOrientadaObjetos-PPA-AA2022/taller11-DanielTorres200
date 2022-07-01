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
    protected double porcentajeDescuento;
    
    public void establecerPorcentajeDescuento(double p){
        porcentajeDescuento = p;
    }
    
    public void obtenerValorDescuento(double x){
        return porcentajeDescuento;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu Economico\n"
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
