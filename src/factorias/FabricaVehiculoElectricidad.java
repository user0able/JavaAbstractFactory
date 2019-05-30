/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorias;

import automovil.abs.Automovil;
import automovil.ext.AutomovilElectricidad;
import automovil.interfaces.FabricaVehiculo;
import scooter.abs.Scooter;
import scooter.ext.ScooterElectricidad;

/**
 *
 * @author user0able
 * Factoria Concreta de vehiculos de electricidad
 */
public class FabricaVehiculoElectricidad implements FabricaVehiculo {
    
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }
    
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color, potencia);
    }
    
}
