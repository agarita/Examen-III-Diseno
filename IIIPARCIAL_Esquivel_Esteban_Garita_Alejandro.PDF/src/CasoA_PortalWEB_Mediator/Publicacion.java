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
public class Publicacion {
    public String contenido;
    public ArrayList<Comentario> comentarios;
    public String nombreUsuario;

    public Publicacion(String contenido, String nombreUsuario) {
        this.contenido = contenido;
        this.nombreUsuario = nombreUsuario;
        comentarios = new ArrayList<>();
    }
    
    
}
