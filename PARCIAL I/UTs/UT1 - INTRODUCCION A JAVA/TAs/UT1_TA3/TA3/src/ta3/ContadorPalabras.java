/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ta3;
import java.io.*;
/**
 *
 * @author Rafael
 */
public class ContadorPalabras  {
    
    

    
    // aquí iría el JavaDoc del método
    public String[] lineasTexto (String frase) {
    
    String[] linesOfFile = null;
    FileReader fr;
    
    try {
        fr = new FileReader(frase);
        BufferedReader br = new BufferedReader(fr);
        String lineaActual = br.readLine();
        
        int fileSize = 0;
        while (lineaActual != null){
            lineaActual = br.readLine();
            fileSize++;
        }
        
        br = new BufferedReader(fr);
        linesOfFile= new String[fileSize];
        int i = 0;
        while (lineaActual != null){
            lineaActual = br.readLine();
            linesOfFile[i] = lineaActual;
            i++;
        }
    }
    
    catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) 
    {
        e.printStackTrace();
    }
    
   
    return linesOfFile;
    }
    // Código sumamente complejo\
    int resultado = 0;
    int consonante=0;
    int vocal=0;
   

    
    
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

