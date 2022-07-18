/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.pd1;

/**
 *
 * @author Rafael
 */
public class PD1 {

    public static void main(String[] args) {

        // Carga del Grafo
        TGrafoNoDirigido gnd = UtilGrafos.cargarGrafo(
                "./src/main/java/aed/pd1/VerticesPrueba.txt", "./src/main/java/aed/pd1/AristasPrueba.txt", false, TGrafoNoDirigido.class);
        Double[][] costosGND = UtilGrafos.obtenerMatrizCostos(gnd.getVertices());
        UtilGrafos.imprimirMatrizMejorado(costosGND, gnd.getVertices(), "Matriz Costos");

        // Busqueda en Profundidad
        gnd.bpf();
        System.out.println("------------------------------------------------");
        gnd.bpf("g");
        System.out.println("------------------------------------------------");
        gnd.bpf("z");

        System.out.println("------------------------------------------------");
        // Busqueda Caminos
        gnd.todosLosCaminos("a", "g").imprimirCaminosConsola();

        System.out.println("Es conexo " + gnd.esConexo());

        // Ejercicio 2 - PRIM
        TGrafoNoDirigido gndPrim = gnd.Prim();
        Double[][] costosPrim = UtilGrafos.obtenerMatrizCostos(gndPrim.getVertices());
        UtilGrafos.imprimirMatrizMejorado(costosPrim, gndPrim.getVertices(), "Matriz Costo Prim");

        // Ejercicio 3 - BEA
        for (TVertice vertice : gnd.bea("e")) {
            System.out.println(vertice.getEtiqueta());
        }

    }
}
