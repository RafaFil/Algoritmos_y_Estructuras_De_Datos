/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd10;

/**
 *
 * @author Rafael
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
    
    public String[] palabrasComunes(String[] palabras1, String[] palabras2){
        // son del mismo tamaño???? asumo que si x el ejemplo
        int contador = 0;
        
        
        for(String s1 : palabras1) {
            
            for (String s2 : palabras2){
                if(s1.equals(s2)){
                    contador++;
                    
                }
            }
            
        }
        String[] respuesta = new String[contador];
        contador = 0;
        for(String s1 : palabras1) {
            
            for (String s2 : palabras2){
                if(s1.equals(s2)){
                    respuesta[contador] = s2;
                    contador++;
                }
            }
            
        }
        
        return respuesta;
    }
    
}
