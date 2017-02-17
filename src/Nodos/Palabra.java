/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author cr-al
 */
public class Palabra {
private String contenido ;
private Palabra siguiente;

    public Palabra() {
        this.contenido = "";
        this.siguiente = null;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Palabra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Palabra siguiente) {
        this.siguiente = siguiente;
    }

 
  

            
}
