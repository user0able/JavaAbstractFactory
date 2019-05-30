/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil.interfaces;

import automovil.abs.Automovil;
import scooter.abs.Scooter;

/**
 *
 * @author user0able
 * Factoria Abstracta
 */
public interface FabricaVehiculo {
    // Factoria de automoviles abstractos
    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
    
    // Factoria de Scooters abstractos
    Scooter creaScooter(String modelo, String color, int potencia);
}
