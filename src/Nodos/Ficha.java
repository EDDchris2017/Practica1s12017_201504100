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
public class Ficha {
    String letra;
    int puntuacion;
    Ficha siguiente;
    
    public void Ficha(){
        this.letra="";
        this.puntuacion=0;
        this.siguiente= null;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Ficha getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Ficha siguiente) {
        this.siguiente = siguiente;
    }
    
}
