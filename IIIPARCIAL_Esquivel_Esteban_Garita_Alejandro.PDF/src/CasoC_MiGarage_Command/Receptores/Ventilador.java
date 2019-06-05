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
        intensidad=20;
    }


    @Override
    public void subir() {
        if(intensidad<25){
            intensidad+=0.1;
            System.out.println("AC subio a "+intensidad);            
        }else{
            System.out.println("AC no permitio el cambio");
        }
        
    }

    @Override
    public void bajar() {
        if(intensidad>10){
            intensidad-=0.1;
            System.out.println("AC bajó a "+intensidad);
        }else{
            System.out.println("AC no permitio el cambio");
        }
    }
    
}
