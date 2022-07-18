/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd2;

/**
 *
 * @author Rafael
 * @param <T>
 */
public class TArbolBB<T> implements IArbolBB {
    
    private TElementoAB<T> raiz;
    
    public TArbolBB(){
        this.raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB unElemento) {
        if (this.raiz == null){
            raiz = unElemento;
        }
        else{
            raiz.insertar(unElemento);
        }
            
       
        return false;
    }

    @Override
    public TElementoAB buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
       if (raiz==null){
           return "arbol vacio";
       }
       else{
           return raiz.preOrden();
       }
    }

    @Override
    public String inOrden() {
        if(raiz == null){
            return "arbol vacio";
        }
        else{
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if (raiz == null) {
            return "arbol vacio";
        } else {
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (raiz != null){
            raiz.eliminar(unaEtiqueta);
        }
        else{
            System.out.println("arbol vacio");
        }
    }
    
    public boolean esVacio(){
        return this.raiz == null;
    }
    
    public TElementoAB<T> elementoMenor() {
        if(raiz == null){
            return null;
        }
        else{
            return raiz.elementoMenor();
        }
    }
    
    public TElementoAB<T> elementoMayor() {
        if(raiz == null){
            return null;
        }
        else{
            return raiz.elementoMayor();
        }
    }
    
    public int obtenerAltura() { // ANDA MAL
        if(this.raiz == null)
            return -1; 
	    else
            return 1+ Math.max(raiz.getHijoIzq().obtenerAltura(), raiz.getHijoDer().obtenerAltura());
    }
    
    public int obtenerTamanio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int obtenerNivel(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int obtenerCantidadHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
