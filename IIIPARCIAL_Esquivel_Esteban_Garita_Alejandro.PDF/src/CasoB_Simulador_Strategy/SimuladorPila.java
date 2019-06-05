/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

import java.util.Iterator;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eadan
 */
public class SimuladorPila implements SimuladorGeneral{

    double tiempoSimulado;
    Stack<Evento> pilaEventos = new Stack<>();
    
    @Override
    public void simular() {
        
        Evento currentEvent;
        while(!pilaEventos.empty()){
            
            currentEvent=pilaEventos.pop();
            
            actuar(currentEvent);
            tiempoSimulado=currentEvent.tiempo;
        }
    }

    public void agregarEvento(Evento evento){
        this.pilaEventos.push(evento);
    }
    
    @Override
    public void actuar(Evento evento) {
        try {
            System.out.println("Corriendo evento "+evento.nombre);
            Thread.sleep((long) ((evento.tiempo)*1000));
        } catch (InterruptedException ex) {
            System.err.println("Error en la ejecucion de "+evento.nombre);
        } 
        
    }

}
