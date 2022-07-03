/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Menu;
import paquete02.Cuenta;
import paquete03.MenuCarta;
import paquete04.MenuNiños;
import paquete05.MenuEconomico;
import paquete06.MenuDia;
/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> listaMenu = new ArrayList<>();
        
        MenuNiños menuNiños1 = new MenuNiños("Niños 01", 2.00 , 1.00, 1.50);
        menuNiños1.calcularValorMenu();
        listaMenu.add(menuNiños1);
        
        MenuNiños menuNiños2 = new MenuNiños("Niños 02", 3.00 , 1.00, 1.50);
        menuNiños2.calcularValorMenu();
        listaMenu.add(menuNiños2);
        
        MenuEconomico menuEconomico1 = new MenuEconomico("Econo 001", 4.00, 25);
        menuEconomico1.calcularValorMenu();
        listaMenu.add(menuEconomico1);
        
        
        MenuDia menuDia1 = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        menuDia1.calcularValorMenu();
        listaMenu.add(menuDia1);
                
        MenuCarta menuCarta1 = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10);
        menuCarta1.calcularValorMenu();
        listaMenu.add(menuCarta1);
        
        Cuenta cuenta1 = new Cuenta("René Elizalde", 10, listaMenu);
        cuenta1.establecerSubtotal();
        cuenta1.establecerValorCancelar();
        
        System.out.println(cuenta1);
    }
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

 */
