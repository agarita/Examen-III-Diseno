/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command.Receptores;

/**
 *
 * @author eadan
 */
public abstract class DispositivoReceptor {
    boolean encendido;
    double intensidad;
    
    public abstract void activar();
    public void desactivar(){
        encendido=false;
        System.out.println("Dispositivo apagado");
    }
    public abstract void subir();
    public abstract void bajar();
    
}
