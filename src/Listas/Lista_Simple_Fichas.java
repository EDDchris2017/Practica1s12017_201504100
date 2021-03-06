/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.Ficha;
import Nodos.Palabra;
import javax.swing.JOptionPane;

/**
 *
 * @author cr-al
 */
public class Lista_Simple_Fichas {

    private Ficha inicio;
    private int tamaño;

    public void Lista_Simple() {
        this.inicio = null;
        this.tamaño = 0;
    }

    //Verificar que la lista no este vacia
    public boolean estaVacia() {
        return inicio == null;
    }
    //Cuanto elementos hay en la lista Simple

    public int getTamaño() {
        return tamaño;
    }

    //Agregar un nuevo nodo al final de la lista
    public void agregarAlFinal(String contenido, int puntuacion) {
        Ficha nuevo = new Ficha();
        nuevo.setLetra(contenido);
        nuevo.setPuntuacion(puntuacion);
        if (estaVacia()) {
            //Inicializar como nuevo nodo
            this.inicio = nuevo;
            //De lo contrario recorrer la lista

        } else {
            Ficha auxiliar = inicio;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            //Agregar nodo al final
            auxiliar.setSiguiente(nuevo);
        }
        tamaño++;

    }

    //Metodo que agrega un nuevo nodo al final de la lista
    public void agregarAlInicio(String contenido) {
        Ficha nuevo = new Ficha();
        nuevo.setLetra(contenido);
        if (estaVacia()) {
            this.inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamaño++;
    }

    //MEtodo para obtener el contenido de un nodo de la lista a partir de una posicion
    public String getContenido(int posicion) throws Exception {
        String retornar = null;
        if (posicion >= 0 && posicion < tamaño) {
            if (posicion == 0) {
                retornar = inicio.getLetra();
            } else {
                Ficha auxiliar = inicio;
                for (int i = 0; i < posicion; i++) {
                    auxiliar = auxiliar.getSiguiente();
                }
                retornar = auxiliar.getLetra();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
        return retornar;

    }

    //Metodo para buscar si existe un valor en la lista
    public boolean buscar(String referencia) {
        Ficha auxiliar = inicio;
        boolean encontrado = false;
        while (auxiliar != null && encontrado != true) {
            if (referencia == auxiliar.getLetra()) {
                encontrado = true;
            } else {
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return encontrado;
    }

    //Eliminar toda la lista
    public void eliminar() {
        // Elimina el valor y la referencia a los demas nodos.
        this.inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        this.tamaño = 0;
    }

    //Metodo para mostrar Lista
    public void mostrarLista() {
        if (!estaVacia()) {
            Ficha auxiliar = inicio;
            int i = 0;
            while (auxiliar != null) {
                JOptionPane.showMessageDialog(null, auxiliar.getLetra());
                auxiliar = auxiliar.getSiguiente();
                //Incrementa el contador
                i++;
            }
        }
    }

    public String imprimirReporte() {
        String codigografo="";
        if (!estaVacia()) {
            Ficha auxiliar = inicio;
            int i = 0;
            while (auxiliar.getSiguiente() != null) {
                i++;
                if(auxiliar.getSiguiente()!=null){
                codigografo=codigografo+ auxiliar.getLetra().replaceAll(" ", "_")+"__"+i+"->"+auxiliar.getSiguiente().getLetra().replaceAll(" ", "_")+"__"+(i+1)+"\n";
                auxiliar = auxiliar.getSiguiente();
                }
                //Incrementa el contador
                
            }
        }
        return codigografo;
    }
}
