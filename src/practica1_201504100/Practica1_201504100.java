/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201504100;

/**
 *
 * @author cr-al
 */
public class Practica1_201504100 {
    public static insertarFichas insertar_fichas= new insertarFichas();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insertar_fichas.insertarFichas();
        VentanaXml archivoXML= new VentanaXml();
        archivoXML.setVisible(true);
       //VentanaUsuarios ventana= new VentanaUsuarios();
       // ventana.setVisible(true);
      
       //Tablero tablero= new Tablero();
       
      //tablero.setVisible(true);
      
    }
    
}
