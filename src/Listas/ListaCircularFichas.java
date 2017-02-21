/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.Ficha;
import Nodos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author cr-al
 */
public class ListaCircularFichas {
    Ficha inicio;
    Ficha ultimo;
    int tamaño;
    
    public void Lista_Circular(){
        this.inicio = null;
        this.ultimo = null;
        this.tamaño = 0;
        
        
    }
    //Si la lista esta vacia
    public boolean estaVacia(){
        return inicio ==null;
    }
    //Cuantos elementos o nodos tiene la lista
    public int getTamaño(){
        return this.tamaño;
    }
    public void agregarAlFinal(String letra,int puntuacion){
        Ficha nuevo= new Ficha();
        nuevo.setLetra(letra);
        nuevo.setPuntuacion(puntuacion);
        //Verificar si la lista no esta vacia
        if(estaVacia()){
            this.inicio = nuevo;
            this.ultimo = nuevo;
            this.ultimo.setSiguiente(inicio);
            //De lo contrario agregar nuevos nodos a la lista
         
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        //Incrementa el valor del tamaño de la lista
        tamaño ++;
    }
    
    public Ficha getLetra(int posicion){
        Ficha retorno=null;
        if( posicion>=0 && posicion<tamaño){
            if(posicion ==0){
                retorno= inicio;
            }else{
                Ficha auxiliar = inicio;
                //Recorre la lista
                for(int i =0;i< posicion; i ++){
                    auxiliar=auxiliar.getSiguiente();
                }
                retorno= auxiliar;
            }
        }else{
            JOptionPane.showMessageDialog(null,"No existe esta posicion en la lista");
        }
        return retorno;
    }
    
        public void eliminarPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamaño){
            if(posicion==0){
                inicio= inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }else{
                Ficha auxiliar=inicio;
                for(int i=0;i<posicion-1;i++){
                    auxiliar=auxiliar.getSiguiente();
                }
                if(auxiliar.getSiguiente()== ultimo){
                    auxiliar.setSiguiente(inicio);
                    ultimo= auxiliar;
                }else{
                    Ficha siguiente= auxiliar.getSiguiente();
                    auxiliar.setSiguiente(siguiente.getSiguiente());
                }
            }
            tamaño--;
        }
    }
    public void imprimir(){
        Ficha auxiliar = new Ficha();
        auxiliar=inicio;
        for(int i=0;i<getTamaño();i++){
            System.out.println(auxiliar.getLetra());
            auxiliar=auxiliar.getSiguiente();
        }
    }
}
