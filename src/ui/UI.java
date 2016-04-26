/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Cripto;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author usuario2
 */
public class UI {
    
    private Scanner sc ;
    private Cripto cripto;
    
    public void cargarCriptograma(){
    System.out.println("Nombre del archivo: ");
           String rutaArchivo =   sc.next();
           this.cripto.cargarCriptograma(rutaArchivo);
    } 
    
}
