/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

/**
 *
 * @author eadan
 */
public class Main {
    public static void main(String[] args){
        MediadorUsuario mU= new MediadorUsuario();
        
        Usuario u1 = new Usuario("Esteban", mU);
        mU.registrar(u1);
        
        Usuario u2 = new Usuario("Alejandro", mU);
        mU.registrar(u2);
        
        Usuario u3 = new Usuario("Nicolas", mU);
        mU.registrar(u3);
        
        System.out.println("********************");
        System.out.println("MENSAJERÍA");
        System.out.println("********************");
        u1.enviar("Hola Alejandro", "Alejandro");
        u2.enviar("Todo bien, como va con la progra?", "Esteban");
        u1.enviar("Ahí va", "Alejandro");
        
        u1.suscribir("Alejandro");
        u2.suscribir("Esteban");
        u3.suscribir("Esteban");
        
        u1.publicar("Que pereza tengo...");
        u1.comentar("Esteban", "Yo también");
        u2.comentar("Esteban", "Me imagine");
        
        u1.publicar("Fatum Fatis");
        u2.comentar("Esteban", "Ego");
        u3.comentar("Esteban", "Perea");
        
        mU.feed("Alejandro");
    }
}
