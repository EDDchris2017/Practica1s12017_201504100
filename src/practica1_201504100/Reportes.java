/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201504100;

import Listas.*;
import Nodos.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author cr-al
 */
public class Reportes {

    public void Reporte_Usuarios() throws IOException {

        String textografo = "";
        String nombre_archivo = "grafoUsuarios";
        textografo = textografo + "digraph G \n {";
        textografo = textografo + VentanaUsuarios.lista_usuarios.imprimirReporte();
        textografo = textografo + "\n" + "}";
        archivoReporteUsuarios(textografo, nombre_archivo);
        String dotPath = "C://Program Files (x86)//Graphviz2.38//bin//dot.exe";
        String archivo_entrada = "C://Graph//" + nombre_archivo + ".txt";
        String archivo_salida = "C://Graph//" + nombre_archivo + ".jpg";
        String tParam = "-Tjpg";
        String tOParam = "-o";
        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = archivo_entrada;
        cmd[3] = tOParam;
        cmd[4] = archivo_salida;
        Runtime rt = Runtime.getRuntime();

        rt.exec(cmd);
        System.out.println("Archivo generado exitosamente");

    }

    public void archivoReporteUsuarios(String contenido, String nombre_archivo) {
        try {
            FileWriter archivo = new FileWriter("C://Graph//" + nombre_archivo + ".txt");

            PrintWriter pw = new PrintWriter(archivo);

            pw.print(contenido);
            archivo.close();
        } catch (Exception e) {

        }

    }

    //Metodos para generar Reporte de Cola de Fichas
    public void Reporte_Fichas_Pendientes() throws IOException {
        String textografo = "";
        String nombre_archivo = "grafoCola_FichasPendientes";
        textografo = textografo + "digraph G \n {";
        textografo = textografo + Practica1_201504100.insertar_fichas.cola_fichas.imprimirReporte();
        textografo = textografo + "\n" + "}";
        archivoReporteUsuarios(textografo, nombre_archivo);
        String dotPath = "C://Program Files (x86)//Graphviz2.38//bin//dot.exe";
        String archivo_entrada = "C://Graph//" + nombre_archivo + ".txt";
        String archivo_salida = "C://Graph//" + nombre_archivo + ".jpg";
        String tParam = "-Tjpg";
        String tOParam = "-o";
        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = archivo_entrada;
        cmd[3] = tOParam;
        cmd[4] = archivo_salida;
        Runtime rt = Runtime.getRuntime();

        rt.exec(cmd);
        System.out.println("Archivo generado exitosamente");
    }

    //Reporte para la lista simple de los Usuario del jugador activo
    public void Reporte_Fichas_Usuarios(String nombre) throws IOException {
        Usuario usuario_activo = VentanaUsuarios.lista_usuarios.getUsuario(nombre);
        if (usuario_activo != null) {
            String textografo = "";
            String nombre_archivo = "grafoFichas_Usuario";
            textografo = textografo + "digraph G \n {";
            textografo = textografo + usuario_activo.getLista_fichas().imprimirReporte();
            textografo = textografo + "\n" + "}";
            archivoReporteUsuarios(textografo, nombre_archivo);
            String dotPath = "C://Program Files (x86)//Graphviz2.38//bin//dot.exe";
            String archivo_entrada = "C://Graph//" + nombre_archivo + ".txt";
            String archivo_salida = "C://Graph//" + nombre_archivo + ".jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = archivo_entrada;
            cmd[3] = tOParam;
            cmd[4] = archivo_salida;
            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);
            System.out.println("Archivo generado exitosamente");

        } else {
            JOptionPane.showMessageDialog(null, "usuario no existe");
        }
    }

    //Report para diccionario
    public void Reporte_Diccionario() throws IOException {

        String textografo = "";
        String nombre_archivo = "grafoDiccionario";
        textografo = textografo + "digraph G \n {";
        textografo = textografo + LeerXML.lista_simple.imprimirReporte();
        textografo = textografo + "\n" + "}";
        archivoReporteUsuarios(textografo, nombre_archivo);
        String dotPath = "C://Program Files (x86)//Graphviz2.38//bin//dot.exe";
        String archivo_entrada = "C://Graph//" + nombre_archivo + ".txt";
        String archivo_salida = "C://Graph//" + nombre_archivo + ".jpg";
        String tParam = "-Tjpg";
        String tOParam = "-o";
        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = archivo_entrada;
        cmd[3] = tOParam;
        cmd[4] = archivo_salida;
        Runtime rt = Runtime.getRuntime();

        rt.exec(cmd);
        System.out.println("Archivo generado exitosamente");

    }
}
