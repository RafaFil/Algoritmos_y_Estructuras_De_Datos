
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 */
import java.util.LinkedList;
public class TArbolPiezas extends TArbolBB<Pieza> implements IArbolPiezas {

   

    @Override
    public TArbolPiezas piezasPorRubro(String unRubro) {
        if (this.esVacio()){
            return null;
        }
        else{
            TArbolPiezas solucion = new TArbolPiezas();
            LinkedList<Pieza> lista = this.inOrden();
            for (Pieza a : lista){
               if(a.obtenerRubro().equals(unRubro)) {
                   TElementoAB<Pieza> aux = new TElementoAB<>(a.getCodigoCatalogo(),a);
                   solucion.insertar(aux);
               }
            }
            
            return solucion;
        }
    }

   

    @Override
    public int[] cantYvalorStock() {
        int[] res = {0,0};
        LinkedList<Pieza> lista = this.inOrden();
        for (Pieza a : lista){
            res[0] = res[0] + a.getCantidad();
            res[1] = res[1] + a.getValorEnStock();
        }
        return res;
    }

}
