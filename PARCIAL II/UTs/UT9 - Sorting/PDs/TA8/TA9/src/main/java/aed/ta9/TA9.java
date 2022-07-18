/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.ta9;

/**
 *
 * @author Rafael
 */
public class TA9 {

    public static void main(String[] args) {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v;
        System.out.println("QUICKSORT:");
        GeneradorDatosGenericos gn = new GeneradorDatosGenericos(300);
        vectorPrueba = gn.generarDatosAscendentes();
        long tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        long tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("3000");
        gn = new GeneradorDatosGenericos(3000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("30000");
        gn = new GeneradorDatosGenericos(30000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 4);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("HEAPSORT:");
        System.out.println("300");
        gn = new GeneradorDatosGenericos(300);
        vectorPrueba = gn.generarDatosAscendentes();
        v = clasificador.clasificar(vectorPrueba, 5);
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("3000");
        gn = new GeneradorDatosGenericos(3000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("30000");
        gn = new GeneradorDatosGenericos(30000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 5);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("BURBSUJA:");
        System.out.println("300");
        gn = new GeneradorDatosGenericos(300);
        vectorPrueba = gn.generarDatosAscendentes();
        v = clasificador.clasificar(vectorPrueba, 3);
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("3000");
        gn = new GeneradorDatosGenericos(3000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("30000");
        gn = new GeneradorDatosGenericos(30000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 3);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("SELECCION:");

        System.out.println("300");
        gn = new GeneradorDatosGenericos(300);
        vectorPrueba = gn.generarDatosAscendentes();
        v = clasificador.clasificar(vectorPrueba, 1);
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("3000");
        gn = new GeneradorDatosGenericos(3000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        System.out.println("30000");
        gn = new GeneradorDatosGenericos(30000);
        vectorPrueba = gn.generarDatosAscendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosDescendentes();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

        vectorPrueba = gn.generarDatosAleatorios();
        tIni = System.nanoTime();
        v = clasificador.clasificar(vectorPrueba, 1);
        tFin = System.nanoTime();
        System.out.println((tFin - tIni));

    }
}
