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
public class Stereo extends DispositivoReceptor {

    @Override
    public void activar() {
        intensidad=50;
        encendido=true;
        System.out.println("Stereo encendido");
    }


    @Override
    public void subir() {
        if(intensidad<100){
            intensidad+=5;
            System.out.println("Stereo subio a "+intensidad);            
        }else{
            System.out.println("Stereo no permitio el cambio");
        }
        
    }

    @Override
    public void bajar() {
        if(intensidad>0){
            intensidad-=5;
            System.out.println("Stereo bajó a "+intensidad);
        }else{
            System.out.println("Stereo no permitio el cambio");
        }
    }
    
}
