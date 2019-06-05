/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author eadan
 */
public class SimuladorCola implements SimuladorGeneral{

    double tiempoSimulado;
    Queue<Evento> colaEventos = new LinkedList<>();
    
    @Override
    public void simular() {
        Iterator<Evento> it = colaEventos.iterator();
        Evento currentEvent;
        while(it.hasNext()){
            
            currentEvent=it.next();
            
            actuar(currentEvent);
            tiempoSimulado=currentEvent.tiempo;
        }
    }

    public void agregarEvento(Evento evento){
        colaEventos.add(evento);
    }
    
    @Override
    public void actuar(Evento evento) {
        try {
            System.out.println("Corriendo evento "+evento.nombre);
            Thread.sleep((long) ((evento.tiempo-tiempoSimulado)*1000));
        } catch (InterruptedException ex) {
            System.err.println("Error en la ejecucion de "+evento.nombre);
        } 
        
    }

   
    
}
