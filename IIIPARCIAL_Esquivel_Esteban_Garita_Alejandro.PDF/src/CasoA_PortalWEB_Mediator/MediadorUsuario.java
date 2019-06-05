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

    @Override
    public boolean registrar(Usuario u) {
        return listaUsuario.add(u);
    }

    @Override
    public boolean enviar(Mensaje m) {
        Usuario para = null;
        for(int i = 0; i < listaUsuario.size(); i++){
            if(listaUsuario.get(i).nombre.equals(m.para))
                para = listaUsuario.get(i);
        }
        if(para == null)
            return false;
        else{
            para.recibir(m);
            return true;
        }
    }

    @Override
    public boolean publicar(Publicacion p) {
        for(int i = 0; i < listaUsuario.size(); i++){
            Usuario u = listaUsuario.get(i);
            if(u.nombre.equals(p.nombreUsuario)){
                for (int j = 0; j < u.subscriptores.size(); j++) {
                    System.out.println("\n************************");
                    System.out.println("NOTIFICACION PARA " + u.subscriptores.get(j).nombre);
                    System.out.println("************************");
                    u.subscriptores.get(j).notificacion(p);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean suscribir(String sub, String u) {
        Usuario subscriptor = null, usuario = null;
        for(int i = 0; i < listaUsuario.size(); i++){
            if(listaUsuario.get(i).nombre.equals(u)){
                usuario = listaUsuario.get(i);
            }
            else if(listaUsuario.get(i).nombre.equals(sub)){
                subscriptor = listaUsuario.get(i);
            }
        }
        if(subscriptor == null || usuario == null)
            return false;
        else{
            usuario.subscriptores.add(subscriptor);
            return true;
        }
    }
 
    @Override
    public boolean comentar(String creador, Comentario c) {
        Usuario u = null;
        for(int i = 0; i < listaUsuario.size(); i++){
            if(listaUsuario.get(i).nombre.equals(creador))
                u = listaUsuario.get(i);
        }
        if(u == null)
            return false;
        else{
            Publicacion p = u.publicaciones.get(u.publicaciones.size()-1);
            p.comentarios.add(c);
            return true;
        }
    }

    @Override
    public void feed(String usuario) {
        System.out.println("\n*****************");
        System.out.println("FEED DE " + usuario);
        System.out.println("*****************");
        ArrayList<Usuario> subscripciones = new ArrayList<>();
        Usuario u = null;
        for(int i = 0; i < listaUsuario.size(); i++){
            Usuario temp = listaUsuario.get(i);
            if(temp.nombre.equals(usuario)){
                u = temp;
            }
            for (int j = 0; j < temp.subscriptores.size(); j++) {
                if(temp.subscriptores.get(j).nombre.equals(usuario))
                    subscripciones.add(temp);
            }
        }
        if(u != null){
            for (int i = 0; i < subscripciones.size(); i++) {
                Usuario temp = subscripciones.get(i);
                for (int j = 0; j < temp.publicaciones.size(); j++) {
                    Publicacion p = temp.publicaciones.get(j);
                    u.notificacion(p);
                }
            }
        }
    }
}
