/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Tomás
 */
public class ContadorPalabras {
    
    // aquí iría el JavaDoc del método
    public int contarPalabras (String frase) {
    
    // Código sumamente complejo\
    boolean esPalabra =false;
    int resultado = 0;
    
        for(int i=0; i<=frase.length()-1;i++) {
            
            if (Character.isLetter(frase.charAt(i))) {
                
                esPalabra = true;
                continue;
            }
            if (frase.charAt(i) == ' ' && esPalabra) {
                resultado++;
                esPalabra = false;
            }
            
        }
        
        if (esPalabra) {
            resultado++;
        }
        
        return resultado;
    
    }
    
        // aquí iría el JavaDoc del método
    public int contarPalabrasSegunLargo (String frase, int largoMinimo) {
    
    // Código sumamente complejo\
    boolean esPalabra = false;
    int largoPalabra = 0;
    int resultado = 0;
    
        for(int i=0; i<=frase.length()-1;i++) {
            
            
            
            if (Character.isLetter(frase.charAt(i))) {
                largoPalabra++;
                esPalabra = true;
                continue;
            }
            else if (frase.charAt(i) != ' ') {
                largoPalabra++;
                continue;
            }
            
            if (frase.charAt(i) == ' ' && esPalabra && largoPalabra > largoMinimo) {
                resultado++;
                largoPalabra = 0;
                esPalabra = false;
            }
            else if (frase.charAt(i) == ' ') {
                largoPalabra = 0;
                esPalabra = false;
            }
            
            
        }
        
        if (esPalabra && largoPalabra > largoMinimo) {
            resultado++;
        }
        
        return resultado;
    
    }
    
    public String[] obtenerLineas(String pathArchivo){
        
        int cantidadLineas = 0;
        
        File archivo = new File (pathArchivo);
        FileReader fr;
        try{
            fr = new FileReader (archivo);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
        BufferedReader br = new BufferedReader (fr);
        try{
            String linea = br.readLine();
            while (linea != null) {
                cantidadLineas++;
                linea = br.readLine();
            }
            String[] arrRetornado = new String[cantidadLineas];
            fr = new FileReader (archivo);
            br = new BufferedReader (fr);
            
            for(int i = 0; i < cantidadLineas; i++){
                arrRetornado[i] = br.readLine();
            }
            return arrRetornado;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
        
        
    }
    
    public int cantPalabras (String[] lineasArchivo){
        int resultado = 0;
        for(int i = 0; i < lineasArchivo.length; i++){
            resultado += this.contarPalabras(lineasArchivo[i]);
        }
        return resultado;
    }

    
}
