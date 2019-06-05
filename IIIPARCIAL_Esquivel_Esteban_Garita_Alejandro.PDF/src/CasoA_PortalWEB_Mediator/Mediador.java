/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

/**
 *
 * @author luisg
 */
public interface Mediador {
    
    public boolean registrar(Usuario u);
    public boolean enviar(Mensaje m);
    public boolean publicar(Publicacion p);
    public boolean suscribir(String sub, String u);
    public boolean comentar(String p, Comentario c);
    public void feed(String u);
}
