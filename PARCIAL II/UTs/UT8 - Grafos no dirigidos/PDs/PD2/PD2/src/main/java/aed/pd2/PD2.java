/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.pd2;

/**
 *
 * @author Rafael
 */
public class PD2 {

    public static void main(String[] args) {
        TGrafoNoDirigido gnd = UtilGrafos.cargarGrafo(
                "./src/main/java/aed/pd2/VerticesPrueba.txt", "./src/main/java/aed/pd2/AristasPrueba.txt", false, TGrafoNoDirigido.class);
        Double[][] costosGND = UtilGrafos.obtenerMatrizCostos(gnd.getVertices());
        UtilGrafos.imprimirMatrizMejorado(costosGND, gnd.getVertices(), "Matriz Costos");

        // IMPLEMENTACION KRUSKAL:
        TGrafoNoDirigido gndKruskal = gnd.Prim();
        Double[][] costosPrim = UtilGrafos.obtenerMatrizCostos(gndKruskal.getVertices());
        UtilGrafos.imprimirMatrizMejorado(costosPrim, gndKruskal.getVertices(), "Matriz Costo Kruskal");       
        
        
        // IMPLEMENTACION PRIM:
        TGrafoNoDirigido gndPrim = gnd.Prim();
        Double[][] costosKruskal = UtilGrafos.obtenerMatrizCostos(gndPrim.getVertices());
        UtilGrafos.imprimirMatrizMejorado(costosKruskal, gndPrim.getVertices(), "Matriz Costo Prim");
    }
}
