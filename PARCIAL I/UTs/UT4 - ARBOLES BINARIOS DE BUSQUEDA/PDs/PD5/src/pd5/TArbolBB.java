/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd5;

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
        if (raiz != null) {
            raiz.eliminar(unaEtiqueta);
        } else {
            System.out.println("arbol vacio");
        }
    }
    
    public boolean esVacio(){
        return this.raiz == null;
    }
    
    public TElementoAB<T> elementoMenor() { // parte a
        if(raiz == null){
            return null;
        }
        else{
            return raiz.elementoMenor();
        }
    }
    
    public TElementoAB<T> elementoMayor() { // parte b
        if(raiz == null){
            return null;
        }
        else{
            return raiz.elementoMayor();
        }
    }
    /*public Integer hojasTotales() {
        if (this == null) {
            return -1;
        } else {
            return raiz.hojasTotales();
        }
    }*/
    
    public Integer suma() {
        if (this == null) {
            return -1;
        } else {
            return raiz.suma();
        }
    }
    
    public boolean esABB(){
        if (esVacio()){
            return false;
        }
        else{
            return raiz.esABB();
        }
    }
    
    
    
}
