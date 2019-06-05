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
public interface Colega {
    public boolean enviar(String msj, String para);
    public void recibir(Mensaje msj);
    public boolean publicar(String msj);
    public Publicacion notificacion(Publicacion pub);
    public boolean suscribir(String u);
    public boolean comentar(String u, String comentario);
}
