/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author usuario2
 */
public class Cripto {
    
    private String letra;
    private int cripto;

    public Cripto(String letra, int cripto) {
        this.letra = letra;
        this.cripto = cripto;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getCripto() {
        return cripto;
    }

    public void setCripto(int cripto) {
        this.cripto = cripto;
    }

    @Override
    public String toString() {
        return "Cripto= " + "letra= " + letra + ", cripto= " + cripto ;
    }

    public void cargarCriptograma(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
