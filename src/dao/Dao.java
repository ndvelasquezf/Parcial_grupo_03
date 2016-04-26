/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Cripto;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario2
 */
public class Dao {
    
   public Cripto cargarLetra (Scanner sc){
       Cripto cripto =null;
       String letra= sc.next().trim();
       int c=sc.nextInt();
       return cripto; 
   }
     
   public ArrayList<Cripto> cargarCriptograma(String archivo) throws FileNotFoundException{
  	ArrayList<Cripto> cripto = new ArrayList<Cripto>();
	Scanner sc;
	sc = new Scanner(new File(archivo));
	sc.useDelimiter(",");
	while (sc.hasNext()) {
		cripto.add(leerCriptograma(sc));
	}
       return null;
       }
   public Cripto leerCriptograma(Scanner sc)  {
	String type = sc.next().trim();
	
		return null; 
    }
}
