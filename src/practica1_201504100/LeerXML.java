/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201504100;

import java.io.File;

import org.jespxml.*;

//Librerias JDOM
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |
/**
 *
 * @author cr-al
 */
public class LeerXML {
    public File xml;
    public String dimension;
    public Celda matriz_tablero[][];
    public void cargarXML(){
        try {
            //Se crear el documento a partir del archivo
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = xml;
            
            
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build( xmlFile );
            
            //Se obtiene la raiz '<scrabble>'
            Element raiz = document.getRootElement();
            //Se guardan todos los hijos de Scrabble
            List lista_raiz = raiz.getChildren("dimension");
            
            //Explorar elementos
            for ( int i = 0; i < lista_raiz.size(); i++ ){
                Element dimension= (Element) lista_raiz.get(i);
                this.dimension = dimension.getText();
                this.matriz_tablero=new Celda[Integer.parseInt(this.dimension)][Integer.parseInt(this.dimension)];
                llenarMatriz();
                JOptionPane.showMessageDialog(null,"dimension "+this.dimension);
            }
            
            List lista_dobles = raiz.getChildren("dobles");
            for(int i=0;i < lista_dobles.size();i++){
                Element doble= (Element) lista_dobles.get(i);
                List lista_casilla= doble.getChildren();
                for(int j=0;j < lista_casilla.size();j++){
                    Element casilla = (Element)lista_casilla.get(j);
                    String x= casilla.getChildTextTrim("x");
                    String y = casilla.getChildTextTrim("y");
                    this.matriz_tablero[Integer.parseInt(x)-1][Integer.parseInt(y)-1].doble=true;
                    JOptionPane.showMessageDialog(null,"x: " +x +" y: "+y);
                    
                }
                
                
            }
            List lista_triples = raiz.getChildren("triples");
            for(int i=0;i < lista_triples.size();i++){
                Element triple= (Element) lista_triples.get(i);
                List lista_casilla= triple.getChildren();
                for(int j=0;j < lista_casilla.size();j++){
                    Element casilla = (Element)lista_casilla.get(j);
                    String x= casilla.getChildTextTrim("x");
                    String y = casilla.getChildTextTrim("y");
                    this.matriz_tablero[Integer.parseInt(x)-1][Integer.parseInt(y)-1].triple=true;
                    JOptionPane.showMessageDialog(null,"triple x: " +x +" y: "+y);
                    
                }
                
                
            }
           
            
            
            
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        } 
             
         }
    
   public void setArchivo(File xml){
       this.xml=xml;
   }
   public void llenarMatriz(){
       for(int i=0; i < Integer.parseInt(this.dimension);i++){
           for(int j=0; j < Integer.parseInt(this.dimension);j++){
               Celda celda = new Celda();
               this.matriz_tablero[i][j]=celda;
           }
       }
   }
}
         
        
    
    
    

      

