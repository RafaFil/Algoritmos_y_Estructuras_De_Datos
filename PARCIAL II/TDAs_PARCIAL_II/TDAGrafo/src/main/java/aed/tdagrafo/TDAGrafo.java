/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.tdagrafo;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Rafael
 */
public class TDAGrafo {

    public static void main(String[] args) {
        TGrafoNoDirigido gnd = UtilGrafos.cargarGrafo("./src/main/java/aed/tdagrafo/aeropuertos_2.txt", "./src/main/java/aed/tdagrafo/conexiones_2.txt",
                false, TGrafoNoDirigido.class);

        Object[] etiquetasarray = gnd.getEtiquetasOrdenado();

        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gnd.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, gnd.getVertices(), "Matriz de Adyacencias");

        TCaminos caminos = gnd.todosLosCaminos("Asuncion", "Montevideo");

        gnd.tieneCiclo("San_Pablo");

        caminos.imprimirCaminosConsola();

        System.out.println(gnd.esConexo());

        gnd.Prim();
        
    }
}
