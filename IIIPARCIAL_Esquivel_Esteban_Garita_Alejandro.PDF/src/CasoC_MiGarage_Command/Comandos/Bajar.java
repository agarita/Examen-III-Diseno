/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command.Comandos;

import CasoC_MiGarage_Command.Receptores.DispositivoReceptor;

/**
 *
 * @author eadan
 */
public class Bajar extends Comando{
    public Bajar(DispositivoReceptor receptor) {
        super.receptor=receptor;
    }
    
    @Override
    public void ejecutar() {
        System.out.println("Bajar dispositivo");
        receptor.bajar();
    }
    
} 
