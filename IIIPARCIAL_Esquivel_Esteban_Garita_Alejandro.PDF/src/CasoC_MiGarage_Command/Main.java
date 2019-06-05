/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command;

import CasoC_MiGarage_Command.Comandos.Activar;
import CasoC_MiGarage_Command.Comandos.Bajar;
import CasoC_MiGarage_Command.Comandos.Comando;
import CasoC_MiGarage_Command.Comandos.Desactivar;
import CasoC_MiGarage_Command.Comandos.Subir;
import CasoC_MiGarage_Command.Receptores.AC;
import CasoC_MiGarage_Command.Receptores.DispositivoReceptor;
import CasoC_MiGarage_Command.Receptores.Luces;
import CasoC_MiGarage_Command.Receptores.Puerta;
import CasoC_MiGarage_Command.Receptores.Stereo;
import CasoC_MiGarage_Command.Receptores.Ventilador;
import java.util.ArrayList;

/**
 *
 * @author eadan
 */
public class Main {
    public static void main(String[] args){
        // Objetos en mi garaje
        ArrayList<DispositivoReceptor> dispositivos = new ArrayList<>();
        dispositivos.add(new AC());
        dispositivos.add(new Stereo());
        dispositivos.add(new Luces());
        dispositivos.add(new Ventilador());
        dispositivos.add(new Puerta());

        ArrayList<Comando> activadores=new ArrayList<>();
        ArrayList<Comando> desactivadores=new ArrayList<>();
        ArrayList<Comando> subidores=new ArrayList<>();
        ArrayList<Comando> bajadores=new ArrayList<>();
        
        for (DispositivoReceptor dispositivo : dispositivos) {
            activadores.add(new Activar(dispositivo));
            desactivadores.add(new Desactivar(dispositivo));
            subidores.add(new Subir(dispositivo));
            bajadores.add(new Bajar(dispositivo));
        }
        
        Invocador elControlRemoto = new Invocador();
        
        for (Comando activador : activadores) {
            elControlRemoto.setComando(activador);
            elControlRemoto.invocar();
        }
        
        for (Comando subidor : subidores) {
            elControlRemoto.setComando(subidor);
            elControlRemoto.invocar();
        }
        
        for (Comando bajador : bajadores) {
            elControlRemoto.setComando(bajador);
            elControlRemoto.invocar();
        }
        
        for (Comando desactivador : desactivadores) {
            elControlRemoto.setComando(desactivador);
            elControlRemoto.invocar();
        }
        
    }
}
