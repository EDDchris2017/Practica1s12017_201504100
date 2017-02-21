/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201504100;
import Listas.Cola;
import Listas.ListaCircularFichas;
import Listas.Lista_Circular;
import Nodos.Ficha;
import javax.swing.JOptionPane;
/**
 *
 * @author cr-al
 */
public class insertarFichas {
    ListaCircularFichas lista_fichas=new ListaCircularFichas();
    Cola cola_fichas=new Cola();
    public void insertarFichas(){
        insertarDatos();
        insertarCola();
        cola_fichas.imprimir();
    }
    public void insertarDatos(){
        for(int i =0;i<12;i++){
            lista_fichas.agregarAlFinal("A",1);
        }
        for(int i =0;i<12;i++){
            lista_fichas.agregarAlFinal("E",1);
        }
        for(int i =0;i<9;i++){
            lista_fichas.agregarAlFinal("O",1);
        }
        for(int i =0;i<6;i++){
            lista_fichas.agregarAlFinal("I",1);
        }
        for(int i =0;i<6;i++){
            lista_fichas.agregarAlFinal("S",1);
        }
        for(int i =0;i<5;i++){
            lista_fichas.agregarAlFinal("N",1);
        }  
         for(int i =0;i<4;i++){
            lista_fichas.agregarAlFinal("L",1);
        }   
        for(int i =0;i<5;i++){
            lista_fichas.agregarAlFinal("R",1);
        }
        for(int i =0;i<5;i++){
            lista_fichas.agregarAlFinal("U",1);
        }
        for(int i =0;i<4;i++){
            lista_fichas.agregarAlFinal("T",1);
        }
        for(int i =0;i<5;i++){
            lista_fichas.agregarAlFinal("D",2);
        }
        for(int i =0;i<2;i++){
            lista_fichas.agregarAlFinal("G",2);
        }
        for(int i =0;i<4;i++){
            lista_fichas.agregarAlFinal("C",3);
        }
        for(int i =0;i<2;i++){
            lista_fichas.agregarAlFinal("B",3);
        }
        for(int i =0;i<2;i++){
            lista_fichas.agregarAlFinal("M",3);
        }
        for(int i =0;i<2;i++){
            lista_fichas.agregarAlFinal("P",3);
        }
        for(int i =0;i<2;i++){
            lista_fichas.agregarAlFinal("H",4);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("F",4);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("V",4);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("Y",4);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("Q",5);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("J",8);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("Ñ",8);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("X",8);
        }
        for(int i =0;i<1;i++){
            lista_fichas.agregarAlFinal("Z",10);
        }        
    }
    
    public void insertarCola(){
       // this.lista_fichas.imprimir();
       // JOptionPane.showMessageDialog(null,lista_fichas.getTamaño());
        int x=94;
        for(int i =0;i<94;i++){
            
                int numeroAleatorio = (int) (Math.random()*x+1);
                Ficha ficha= this.lista_fichas.getLetra(numeroAleatorio);

                this.cola_fichas.insertar(ficha.getLetra(), ficha.getPuntuacion()); 
                this.lista_fichas.eliminarPorPosicion(numeroAleatorio);
                x=x-1;
            
        }
        

    }
}
