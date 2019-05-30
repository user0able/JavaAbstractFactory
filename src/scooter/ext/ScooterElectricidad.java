package scooter.ext;

import scooter.abs.Scooter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user0able
 */
public class ScooterElectricidad extends Scooter {  
    
  public ScooterElectricidad(String modelo, String color,  
    int potencia) {  
    super(modelo, color, potencia); 
  }  
  
  public void mostrarCaracteristicas() {  
    System.out.println("Scooter electrica de modelo: " +  
      modelo + " de color: " + color +   
      " de potencia: " + potencia);  
  }  
  
}  
  
