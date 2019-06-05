/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command.Comandos;

/**
 *
 * @author eadan
 */
public class Bajar extends Comando{
    
    
    @Override
    public void ejecutar() {
        receptor.bajar();
        System.out.println("Bajar dispositivo");
    }
    
} 
