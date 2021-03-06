/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author cr-al
 */
public class Lista_Circular {
    Usuario inicio;
    Usuario ultimo;
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
    public void agregarAlFinal(String nombre,Lista_Simple_Fichas lista,int punteo){
        Usuario nuevo= new Usuario();
        nuevo.setNombre(nombre);
        nuevo.setLista_fichas(lista);
        nuevo.setPunteo(punteo);
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
    
    public String getNombre(int posicion){
        String retorno=null;
        if( posicion>=0 && posicion<tamaño){
            if(posicion ==0){
                retorno=  inicio.getNombre();
            }else{
                Usuario auxiliar = inicio;
                //Recorre la lista
                for(int i =0;i< posicion; i ++){
                    auxiliar.getSiguiente();
                }
                retorno= auxiliar.getNombre();
            }
        }else{
            JOptionPane.showMessageDialog(null,"No existe esta posicion en la lista");
        }
        return retorno;
    }
    //Metodo para regresar el objeto Usuario
        public Usuario getUsuario(String valor){
                 int contador=0;
        Usuario auxiliar= inicio ;
        Usuario retornar=null;
        boolean encontrado = false;
        do{
            if(valor.equals(auxiliar.getNombre())){
                encontrado=true;
                retornar=auxiliar;
            }else{
                contador=contador+1;
                auxiliar= auxiliar.getSiguiente();
            }
        }while(auxiliar!=inicio && encontrado!=true);
        return retornar;
    }
        
    public boolean buscarUsuario(String valor){
        int contador=0;
        Usuario auxiliar= inicio ;
        boolean encontrado = false;
        do{
            if(valor==auxiliar.getNombre()){
                encontrado=true;
            }else{
                contador=contador+1;
                auxiliar= auxiliar.getSiguiente();
            }
        }while(auxiliar!=inicio && encontrado!=true);
        return encontrado;
    }
    
    public void eliminarPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamaño){
            if(posicion==0){
                inicio= inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }else{
                Usuario auxiliar=inicio;
                for(int i=0;i<posicion-1;i++){
                    auxiliar=auxiliar.getSiguiente();
                }
                if(auxiliar.getSiguiente()== ultimo){
                    auxiliar.setSiguiente(inicio);
                    ultimo= auxiliar;
                }else{
                    Usuario siguiente= auxiliar.getSiguiente();
                    auxiliar.setSiguiente(siguiente.getSiguiente());
                }
            }
            tamaño--;
        }
    }
    public String imprimirReporte(){
        String codigografo="";
        Usuario auxiliar = this.inicio;
        for(int i=0;i<tamaño;i++){
            codigografo=codigografo+ auxiliar.getNombre().replaceAll(" ", "_")+"->"+auxiliar.getSiguiente().getNombre().replaceAll(" ", "_")+"\n";
            auxiliar=auxiliar.getSiguiente();
        }
        return codigografo;
    }
}
