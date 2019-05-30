/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorias;

import automovil.abs.Automovil;
import automovil.ext.AutomovilGasolina;
import automovil.interfaces.FabricaVehiculo;
import scooter.abs.Scooter;
import scooter.ext.ScooterGasolina;

/**
 *
 * @author user0able
 * Factoria concreta de vehiculos a Gasolina
 */
public class FabricaVehiculoGasolina implements FabricaVehiculo {

    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {  
        return new AutomovilGasolina(modelo, color, potencia, espacio);  
    }  

    public Scooter creaScooter(String modelo, String color, int potencia) {  
        return new ScooterGasolina(modelo, color, potencia);  
    }  

}
