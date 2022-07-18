/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd2;

/**
 *
 * @author Rafael
 */
public class PD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TArbolBB arbol = new TArbolBB();
        
        String[] elementos = ManejadorArchivosGenerico.leerArchivo(".\\archivos\\clavesPrueba.txt");
        
        for (String elemento : elementos){
            TElementoAB aux = new TElementoAB(Integer.valueOf(elemento),elemento);
            arbol.insertar(aux);
        }
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\OrdenesPrueba.txt", "InOrder: ".split(" "));
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\OrdenesPrueba.txt", arbol.inOrden().split(" "));
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\OrdenesPrueba.txt", "preOrder: ".split(" "));
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\OrdenesPrueba.txt", arbol.preOrden().split(" "));
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\OrdenesPrueba.txt", "postOrder: ".split(" "));
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\OrdenesPrueba.txt", arbol.postOrden().split(" "));
        
        String[] claves = ManejadorArchivosGenerico.leerArchivo(".\\archivos\\claves1.txt");
        TArbolBB arbol2 = new TArbolBB();
        
        for (String clave : claves){
           TElementoAB aux = new TElementoAB(Integer.valueOf(clave),clave);
           arbol2.insertar(aux);
        }
        
        System.out.println(arbol2.buscar(10635)!=null);
        System.out.println(arbol2.buscar(4567)!= null);
        System.out.println(arbol2.buscar(12)!= null);
        System.out.println(arbol2.buscar(8978)!=null);
        
        ManejadorArchivosGenerico.escribirArchivo(
                ".\\archivos\\Postorderclaves1.txt", arbol2.preOrden().split(" "));
        System.out.println(arbol.inOrden());
        System.out.println(arbol.elementoMenor().imprimir());
        System.out.println(arbol.elementoMayor().imprimir());
        System.out.println(arbol2.inOrden());
        System.out.println(arbol2.elementoMenor().imprimir());
        arbol.eliminar(1383);
        System.out.println(arbol.inOrden());
        System.out.println(arbol.preOrden());
   }
    
}
