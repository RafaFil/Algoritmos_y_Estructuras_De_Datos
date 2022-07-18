/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aed.pd3;


/**
 *
 * @author Rafael
 */
public class PD3 {

    public static void main(String[] args) {
        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/main/java/aed/pd3/aeropuertos.txt","./src/main/java/aed/pd3/conexiones.txt",
                false, TGrafoDirigido.class);
        
    Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
    UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
    Double[][] mfloyd = gd.floyd();
    UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
        
    System.out.println("Centro del grafo: " + gd.centroDelGrafo());
    
    // Ejercicio 2:
    
    System.out.println("----------------EJERCICIO 2-----------------------");
        
    System.out.println(gd.existeCamino("Montevideo", "San_Pablo"));
        
    // Ejercicio 3:
    System.out.println("----------------EJERCICIO 3-----------------------");
    //gd.bpf();
    gd.bpf("Montevideo");
        
    }

}
