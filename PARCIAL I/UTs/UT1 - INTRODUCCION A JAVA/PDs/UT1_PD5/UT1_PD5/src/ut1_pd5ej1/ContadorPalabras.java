/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd5ej1;

/**
 *
 * @author Rafael
 */
public class ContadorPalabras {
    
    public int[] contadorVocalConsonante(String frase){
    boolean esPalabra =false;
    int resultado = 0;
    int consonante=0;
    int vocal=0;
    
    
        for(int i=0; i<=frase.length()-1;i++) {
            String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
            
            if (Character.isLetter(frase.charAt(i))) {
                
                esPalabra = true;
                if (vocales.indexOf(frase.charAt(i))== -1){
                    consonante++;
                    // ver como hacer esto con un enum
                }
                else{
                    vocal++;
                }
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
        
        int[] resultadoArr = {vocal, consonante};
        return resultadoArr;
     
    }
}
