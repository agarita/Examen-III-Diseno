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
public class Luces extends DispositivoReceptor {

    @Override
    public void activar() {
        intensidad=3;
        encendido=true;
        System.out.println("Luces encendidas");
    }


    @Override
    public void subir() {
        if(intensidad<3){
            intensidad+=1;
            System.out.println("Luces subieron a "+intensidad);            
        }else{
            System.out.println("Luces no permitieron el cambio");
        }
        
    }

    @Override
    public void bajar() {
        if(intensidad>1){
            intensidad-=1;
            System.out.println("Luces bajaron a "+intensidad);
        }else{
            System.out.println("Luces no permitieron el cambio");
        }
    }
    
}
