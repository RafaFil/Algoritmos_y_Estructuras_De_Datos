/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut1;
import java.util.Arrays;
/**
 *
 * @author Tomás
 */
public class UT1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ContadorPalabras contadorPal = new ContadorPalabras();
        System.out.println(Arrays.toString(contadorPal.obtenerLineas("C:\\Users\\Tomás\\OneDrive\\Documentos\\NetBeansProjects\\UT1\\src\\main\\java\\com\\mycompany\\ut1\\textoEjemplo.txt")));
    }
}
