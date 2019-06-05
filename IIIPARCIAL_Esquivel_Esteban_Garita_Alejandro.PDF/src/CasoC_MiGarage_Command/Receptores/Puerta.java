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
public class Puerta extends DispositivoReceptor {

    @Override
    public void activar() {
        intensidad=100;
        encendido=true;
        System.out.println("Puerta abierta");
    }

    @Override
    public void desactivar() {
        intensidad=0;
        encendido=false;
        System.out.println("Puerta cerrada");
    }

    

    @Override
    public void subir() {
        if(intensidad<100){
            intensidad+=25;
            System.out.println("Puerta subio a "+intensidad);            
        }else{
            System.out.println("Puerta no permitio el cambio");
        }
        
    }

    @Override
    public void bajar() {
        if(intensidad>0){
            intensidad-=25;
            System.out.println("Puerta bajó a "+intensidad);
        }else{
            System.out.println("Puerta no permitio el cambio");
        }
    }
    
}
