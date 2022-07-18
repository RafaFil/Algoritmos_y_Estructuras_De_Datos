/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd3;

/**
 *
 * @author Rafael
 */
public class PD3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        Nodo nodo1 = new Nodo(0,1);
        Nodo nodo2 = new Nodo(1,7);
        Nodo nodo3 = new Nodo(2,4);
        
        
        System.out.println(lista.imprimir());
        lista.insertar(nodo1);
        lista.insertar(nodo2);
        lista.insertar(nodo3);
        System.out.println(lista.imprimir());
        System.out.println(lista.imprimir("|"));
        System.out.println(lista.cantElementos());
        System.out.println(lista.esVacia());
        System.out.println(lista.eliminar(1));
        System.out.println(lista.imprimir());
        System.out.println(lista.buscar(1));
        
    }
    
}
