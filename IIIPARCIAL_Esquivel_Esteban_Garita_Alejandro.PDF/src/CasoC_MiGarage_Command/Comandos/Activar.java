/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command.Comandos;

import CasoC_MiGarage_Command.Receptores.AC;
import CasoC_MiGarage_Command.Receptores.DispositivoReceptor;

/**
 *
 * @author eadan
 */
public class Activar extends Comando{

    public Activar(DispositivoReceptor receptor) {
        super.receptor=receptor;
    }
    
    
    @Override
    public void ejecutar() {
        System.out.println("Activando dispositivo");
        receptor.activar();
        
    }
    
} 
