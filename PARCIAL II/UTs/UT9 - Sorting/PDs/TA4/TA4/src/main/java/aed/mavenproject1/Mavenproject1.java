/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.mavenproject1;

/**
 *
 * @author Rafael
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v;
        GeneradorDatosGenericos gn = new GeneradorDatosGenericos(300);
        vectorPrueba = gn.generarDatosAleatorios();
        long tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        long tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        gn = new GeneradorDatosGenericos(10000);
        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        gn = new GeneradorDatosGenericos(30000);
        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
         System.out.println(tFin - tIni);

        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println(tFin - tIni);

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
         System.out.println(tFin - tIni);
    }
}
