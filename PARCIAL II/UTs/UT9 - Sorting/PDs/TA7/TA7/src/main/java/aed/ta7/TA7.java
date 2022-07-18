/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.ta7;

/**
 *
 * @author Rafael
 */
public class TA7 {

    public static void main(String[] args) {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v = clasificador.clasificar(vectorPrueba, 6);
        for (int i : v){
            System.out.print(i + " ");
        }
    }
}
