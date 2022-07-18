/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_pd10;

/**
 *
 * @author Rafael
 */
public class UT1_PD10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] Ar1 = {"Hola","mundo","de","los","algoritmos"};
        String[] Ar2 = {"Hola","mundo","de","la","informatica"};
        ContadorPalabras contador = new ContadorPalabras();
        String [] respuesta = contador.palabrasComunes(Ar1, Ar2);
        for (String s : respuesta){
            System.out.println(s);
        }
        
    }
    
}
