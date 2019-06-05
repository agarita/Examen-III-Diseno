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
public class Ventilador extends DispositivoReceptor {

    @Override
    public void activar() {
        intensidad=50;
        encendido=true;
        System.out.println("Ventilador encendido");
    }


    @Override
    public void subir() {
        if(intensidad<100){
            intensidad+=10;
            System.out.println("Ventilador subio a "+intensidad);            
        }else{
            System.out.println("Ventilador no permitio el cambio");
        }
        
    }

    @Override
    public void bajar() {
        if(intensidad>10){
            intensidad-=10;
            System.out.println("Ventilador bajó a "+intensidad);
        }else{
            System.out.println("Ventilador no permitio el cambio");
        }
    }
    
}
