/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;
import Listas.Lista_Simple_Fichas;
/**
 *
 * @author cr-al
 */
public class Usuario {
    String nombre;
    int punteo;
    Lista_Simple_Fichas lista_fichas;
    Usuario siguiente;

    public Usuario() {
        this.nombre = "";
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }

    public Lista_Simple_Fichas getLista_fichas() {
        return lista_fichas;
    }

    public void setLista_fichas(Lista_Simple_Fichas lista_fichas) {
        this.lista_fichas = lista_fichas;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    

    
}
