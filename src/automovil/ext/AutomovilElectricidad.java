/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil.ext;

import automovil.abs.Automovil; // para extender esta clase a partir de la abstracción de automovil

/**
 *
 * @author user0able
 */
public class AutomovilElectricidad extends Automovil{

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("########### Caracteristicas: ############");
        System.out.println("Automovil electrico: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Espacio: " + this.espacio);
    }

    
    
}
