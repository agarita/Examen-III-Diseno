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
        Usuario de = null, para = null;
        for(int i = 0; i < listaUsuario.size(); i++){
            if(listaUsuario.get(i).nombre.equals(m.para)){
                para = listaUsuario.get(i);
            }
            else if(listaUsuario.get(i).nombre.equals(m.de)){
                de = listaUsuario.get(i);
            }
        }
        if(de == null || para == null)
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
    public boolean comentar(Publicacion p, Comentario c) {
        return p.comentarios.add(c);
    }
}
