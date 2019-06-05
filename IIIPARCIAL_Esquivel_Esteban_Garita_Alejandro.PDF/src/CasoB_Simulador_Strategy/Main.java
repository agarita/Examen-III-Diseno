/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoB_Simulador_Strategy;

/**
 *
 * @author eadan
 */
public class Main {
    
    public static void main(String[] args) {
        SimuladorGeneral[] simuladores={new SimuladorCola(), new SimuladorPila()};
        for (SimuladorGeneral simulador : simuladores) {
            for(int i=0;i<5;++i){
                simulador.agregarEvento(new Evento("Ev"+(i+1), i));
            }
        }
        for (SimuladorGeneral simulador : simuladores) {
            simulador.simular();
        }
    }
}
