/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

import java.util.ArrayList;

/**
 *
 * @author luisg
 */
public class MediadorUsuario implements Mediador{

    public ArrayList<Usuario> listaUsuario;
    
    public MediadorUsuario() {
        listaUsuario = new ArrayList<>();
    }

    
}
