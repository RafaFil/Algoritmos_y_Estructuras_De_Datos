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
        System.out.println("Hello World!");
        
        
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        arbol.insertar(2, 1);
        arbol.insertar(3, 1);
        arbol.insertar(4, 2);
        System.out.println(arbol.preOrden());
        System.out.println(arbol.buscar(4).getEtiqueta());
        
        System.out.println(arbol.listarIndentado());
    }
}
