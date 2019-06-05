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
public class Usuario implements Colega{
    
    public int id;
    public String nombre;
    public MediadorUsuario mediador;
    public ArrayList<Usuario> subscriptores;
    public ArrayList<Publicacion> publicaciones;
    
    public Usuario(int id, String nombre, MediadorUsuario mediadorUsuario){
        this.id = id;
        this.nombre = nombre;
        mediador = mediadorUsuario;
        subscriptores = new ArrayList<>();
        publicaciones = new ArrayList<>();
    }
    
    @Override
    public boolean enviar(Mensaje msj) {
        return mediador
    }

    @Override
    public void recibir(Mensaje msj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean publicar(String msj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificacion(Publicacion pub) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean suscribir(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean comentar(Publicacion pub, String comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
