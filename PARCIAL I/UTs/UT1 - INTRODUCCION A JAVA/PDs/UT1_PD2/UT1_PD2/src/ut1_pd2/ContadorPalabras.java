/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd2;

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
    
}