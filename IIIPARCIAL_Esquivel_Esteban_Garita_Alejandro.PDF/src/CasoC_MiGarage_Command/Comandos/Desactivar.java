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
public class Desactivar extends Comando{
    public Desactivar(DispositivoReceptor receptor) {
        super.receptor=receptor;
    }
    
    @Override
    public void ejecutar() {
        System.out.println("Desactivando dispositivo");
        receptor.desactivar();
    }
    
}
