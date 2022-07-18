/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aed.pd4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafael
 */
public class PD4 {

    public static void main(String[] args) {
        // EJERCICIO 1:

        // EJERCICIO 2: CONECTADOS CON
        TGrafoNoDirigido gnd = UtilGrafos.cargarGrafo(
                "./src/main/java/aed/pd4/VerticesPrueba.txt", "./src/main/java/aed/pd4/AristasPrueba.txt", false, TGrafoNoDirigido.class);
        //Double[][] costosGND = UtilGrafos.obtenerMatrizCostos(gnd.getVertices());
        //UtilGrafos.imprimirMatrizMejorado(costosGND, gnd.getVertices(), "Matriz Costos");
        
        
        Map<Comparable, TVertice> verticesGnd = gnd.getVertices();
        System.out.println(gnd.conectadoCon(verticesGnd.get("a"),verticesGnd.get("f")));
        //System.out.println(gnd.esConexo());
        // COMO EL GRAFO ES CONEXO, LO QUE OCURRE ES QUE TODOS LOS VERTICES VAN A ESTAR CONECTADOS CON TODOS LOS VERTICES
    }
}
