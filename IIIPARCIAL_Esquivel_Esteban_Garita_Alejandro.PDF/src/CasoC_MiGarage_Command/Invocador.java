/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoC_MiGarage_Command;

import CasoC_MiGarage_Command.Comandos.Comando;

/**
 *
 * @author eadan
 */
public class Invocador {
    Comando comando;

    public Invocador() {
    }

    public Comando getComando() {
        return comando;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }
    public void invocar(){
        comando.ejecutar();
    }
}
