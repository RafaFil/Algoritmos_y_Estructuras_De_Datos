/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd5;

/**
 *
 * @author Rafael
 */
public class PD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TArbolBB ar = new TArbolBB();
        for (int i = 0; i<=100;i++){
            ar.insertar(new TElementoAB(i,i));
        }
        System.out.println(ar.suma());
        
        TArbolBB ar1 = new TArbolBB();
        TElementoAB nodo1 = new TElementoAB(15,2);
        TElementoAB nodo2 = new TElementoAB(20,2);
        TElementoAB nodo3 = new TElementoAB(5,2);
        TElementoAB nodo4 = new TElementoAB(1,2);
        ar1.insertar(nodo1);
        ar1.insertar(nodo2);
        ar1.insertar(nodo3);
        ar1.insertar(nodo4);
        
        //System.out.println(ar1.hojasTotales());
        System.out.println(ar1.preOrden());
        System.out.println(ar1.esABB());
    }
    
}
