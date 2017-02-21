/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.Ficha;

/**
 *
 * @author cr-al
 */
public class Cola {
    Ficha raiz;
    Ficha fondo;
    int tamaño;
    public void Cola(){
        this.raiz = null;
        this.fondo = null;
        this.tamaño = 0;
    }
    public Boolean estaVacia(){
        return raiz == null;
    }
   public void insertar(String letra,int puntuacion){
       Ficha nuevo= new Ficha();
       nuevo.setLetra(letra);
       nuevo.setPuntuacion(puntuacion);
       nuevo.setSiguiente(null);
       if (estaVacia()){
           raiz = nuevo;
           fondo = nuevo ;
       }else{
           fondo.setSiguiente(nuevo);
           fondo = nuevo;
           
       }
       tamaño++;
   }
   public int getTamaño(){
       return this.tamaño;
   }
   public Ficha eliminarCola(){
       Ficha ficha = null;
       if(!estaVacia()){
           ficha= raiz;
           if(raiz == fondo){
               raiz = null;
               fondo = null;
           }else{
               raiz = raiz.getSiguiente();
           }
           
       }
       return ficha;
   }
        public void imprimir() {
        Ficha reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.println(reco.getLetra());
            reco=reco.getSiguiente();
        }
        System.out.println();
    }
}
