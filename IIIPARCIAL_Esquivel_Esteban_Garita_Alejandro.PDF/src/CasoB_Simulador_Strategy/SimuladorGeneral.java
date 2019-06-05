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
public interface SimuladorGeneral {
    public void simular();
    public void actuar(Evento evento);
    public void agregarEvento(Evento evento);
}
