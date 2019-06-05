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
    
    public String nombre;
    public MediadorUsuario mediador;
    public ArrayList<Usuario> subscriptores;
    public ArrayList<Publicacion> publicaciones;
    
    public Usuario(String nombre, MediadorUsuario mediadorUsuario){
        this.nombre = nombre;
        mediador = mediadorUsuario;
        subscriptores = new ArrayList<>();
        publicaciones = new ArrayList<>();
    }
    
    @Override
    public boolean enviar(String msj, String para) {
        Mensaje m = new Mensaje(nombre, para, msj);
        return mediador.enviar(m);
    }

    @Override
    public void recibir(Mensaje msj) {
        System.out.println(msj.de + " dice: " + msj.mensaje);
    }

    @Override
    public boolean publicar(String msj) {
        Publicacion p = new Publicacion(msj, nombre);
        publicaciones.add(p);
        return mediador.publicar(p);
    }

    @Override
    public Publicacion notificacion(Publicacion pub) {
        System.out.println(pub.nombreUsuario + ": " + pub.contenido);
        for (int i = 0; i < pub.comentarios.size(); i++) {
            Comentario c = pub.comentarios.get(i);
            System.out.println("\t" + c.nombreUsuario + ": " + c.contenido);
        }
        return pub;
    }

    @Override
    public boolean suscribir(String usuario) {
        return mediador.suscribir(nombre, usuario);
    }

    @Override
    public boolean comentar(String creador, String comentario) {
        Comentario c = new Comentario(comentario, nombre);
        return mediador.comentar(creador, c);
    }    
}
