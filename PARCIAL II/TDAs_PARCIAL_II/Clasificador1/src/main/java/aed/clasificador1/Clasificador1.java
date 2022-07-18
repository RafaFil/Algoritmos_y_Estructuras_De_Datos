/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aed.clasificador1;

/**
 *
 * @author Rafael
 */
public class Clasificador1 {

    public static void main(String[] args) {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        boolean a = estaOrdenado(vectorPrueba);
        System.out.println(a); // false
        int[] v;
        //Insercion
        v = clasificador.clasificar(vectorPrueba, 1);
        
        for (int i : v) {
            System.out.print(i + " - ");
        }
        System.out.println(estaOrdenado(v));

        // ShellSort
        v = clasificador.clasificar(vectorPrueba, 2);
        for (int i : v) {
            System.out.print(i + " - ");
        }
        System.out.println(estaOrdenado(v));

        // Burbuja
        v = clasificador.clasificar(vectorPrueba, 3);
        for (int i : v) {
            System.out.print(i + " - ");
        }
        System.out.println(estaOrdenado(v));
         
       //
       v = clasificador.clasificar(vectorPrueba, 6);
       for (int i : v){
           System.out.print(i + " - ");
       }
       System.out.println(estaOrdenado(v));
       

//        // QuickSort
//        long tIni = System.nanoTime();
//
//        v = clasificador.clasificar(vectorPrueba, 4);
//        long tFin = System.nanoTime();
//
//        //System.out.println(tFin - tIni);
//
//        //for (int i : v) {
//            //System.out.print(i + " - ");
//        }
//        //System.out.println(estaOrdenado(v));


//        GeneradorDatosGenericos gn = new GeneradorDatosGenericos(300); -> IGNORAR!
//        vectorPrueba = gn.generarDatosAleatorios();
//        long tIni = System.nanoTime();
//        v = clasificador.clasificar(vectorPrueba, 5);
//        long tFin = System.nanoTime();
//        System.out.println(tFin - tIni);
//        
//        vectorPrueba = gn.generarDatosAscendentes();
//        tIni = System.nanoTime();
//        v = clasificador.clasificar(vectorPrueba, 5);
//        tFin = System.nanoTime();
//        System.out.println(tFin - tIni);
//        
//        vectorPrueba = gn.generarDatosDescendentes();
//        tIni = System.nanoTime();
//        v = clasificador.clasificar(vectorPrueba, 5);
//        tFin = System.nanoTime();
//        System.out.println(tFin - tIni);
//        
//         gn = new GeneradorDatosGenericos(10000);
//         vectorPrueba = gn.generarDatosAleatorios();
//         tIni = System.nanoTime();
//        v = clasificador.clasificar(vectorPrueba, 5);
//         tFin = System.nanoTime();
//        System.out.println(tFin - tIni);
//        
//        vectorPrueba = gn.generarDatosAscendentes();
//        tIni = System.nanoTime();
//        v = clasificador.clasificar(vectorPrueba, 5);
//        tFin = System.nanoTime();
//        System.out.println(tFin - tIni);
//        
//        vectorPrueba = gn.generarDatosDescendentes();
//        tIni = System.nanoTime();
//        v = clasificador.clasificar(vectorPrueba, 5);
//        tFin = System.nanoTime();
//        System.out.println(tFin - tIni);
        //for (int i : v) {
            //System.out.print(i + " - ");
        //}

        //System.out.println(estaOrdenado(v));
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
