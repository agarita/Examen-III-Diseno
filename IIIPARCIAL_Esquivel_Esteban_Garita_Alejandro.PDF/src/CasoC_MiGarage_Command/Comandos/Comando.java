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
public abstract class Comando {
    public DispositivoReceptor receptor;
    
    public abstract void ejecutar();
}
