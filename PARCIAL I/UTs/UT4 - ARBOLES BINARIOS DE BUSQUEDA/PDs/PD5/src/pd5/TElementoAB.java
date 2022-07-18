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
public class TElementoAB<T> implements IElementoAB<T> {
    
    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T datos;
    
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        this.etiqueta = unaEtiqueta;
        this.datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(etiqueta) == 0) {
            return this;
        } else {
            if (unaEtiqueta.compareTo(etiqueta) < 0) {
                if (hijoIzq != null) {
                    return hijoIzq.buscar(unaEtiqueta);
                } else {
                    return null;
                }
            } else {
                if (unaEtiqueta.compareTo(etiqueta) > 0) {
                    if (hijoDer != null) {
                        return hijoDer.buscar(unaEtiqueta);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (this.hijoIzq != null) {
                return getHijoIzq().insertar(elemento);
            } else {
                this.hijoIzq = elemento;
                return true;
            }
        } else if (elemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (this.hijoDer != null) {
                return getHijoDer().insertar(elemento);
            } else {
                this.hijoDer = elemento;
                return true;
            }
        } else {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    @Override
    public String preOrden() {
        String strTemp = "";
        strTemp = strTemp + this.imprimir() + " ";
        if (hijoIzq != null) {
            strTemp = strTemp + hijoIzq.preOrden();
        }
        if (hijoDer != null) {
            strTemp = strTemp + hijoDer.preOrden();
        }
        return strTemp;
    }

    @Override
    public String inOrden() {
        String tempStr = "";
        if (hijoIzq != null) {
            tempStr = hijoIzq.inOrden();
        }
        tempStr = tempStr + this.imprimir() + " ";
        if (hijoDer != null) {
            tempStr = tempStr + hijoDer.inOrden();
        }
        return tempStr;
    }

    @Override
    public String postOrden() {
        String strTemp = "";
        if (hijoIzq != null) {
            strTemp = strTemp + hijoIzq.postOrden();
        }
        if (hijoDer != null) {
            strTemp = strTemp + hijoDer.postOrden();
        }
        strTemp = strTemp + this.imprimir() + " ";
        return strTemp;
    }

    @Override
    public T getDatos() {
        return this.datos;
    }
    
    public String imprimir(){
        return this.etiqueta.toString();
    }
    
    public TElementoAB<T> elementoMenor(){  // Revisar -> probar con la raiz
        
        
        TElementoAB<T> actual = this;
        if (actual.getHijoIzq() != null){
            actual = actual.getHijoIzq().elementoMenor();
        }
        
        return actual;
    }
    public TElementoAB<T> elementoMayor(){  // Revisar -> probar con la raiz
        
        
        TElementoAB<T> actual = this;
        if (actual.getHijoDer() != null){
            actual = actual.getHijoDer().elementoMayor();
        }
        
        return actual;
    }
    
    public Integer hojasTotales(){
        Integer total = 0;
        if (hijoIzq != null){
            if (hijoIzq.getHijoIzq() == null && hijoIzq.getHijoDer() == null){
                total++;
            }
            hijoIzq.hojasTotales();
        }
        if (hijoDer != null) {
            if (hijoDer.getHijoIzq() == null && hijoDer.getHijoDer() == null) {
                total++;
            }
            hijoDer.hojasTotales();
        }
        
        return total;
    }
    
    public Integer suma(){  // WORKS!!
        Integer total =0;
        if (hijoIzq != null){
            total = total + hijoIzq.suma();
        }
        if(hijoDer != null){
            total = total + hijoDer.suma();
        }
        total = total + Integer.valueOf(this.imprimir());
        return total;
    }
    
    
    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        if (hijoIzq != null) {
            if (unaEtiqueta.compareTo(etiqueta) < 0) {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }
        if (unaEtiqueta.compareTo(etiqueta) > 0) {
            if (hijoDer != null) {
                hijoDer = hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }
        return quitaElNodo();
    }

    private TElementoAB quitaElNodo() {
        if (hijoIzq == null) {
            return hijoDer;
        }
        if (hijoDer == null) {
            return hijoIzq;
        }
        TElementoAB elHijo = hijoIzq;
        TElementoAB elPadre = this;
        while (elHijo.hijoDer != null) {
            elPadre = elHijo;
            elHijo = elHijo.hijoDer;
        }
        if (elPadre == this) {
            elPadre.hijoDer = elHijo.hijoIzq;
            elHijo.hijoIzq = hijoIzq;
        }
        elHijo.hijoIzq = hijoIzq;
        return elHijo;
    }
    
    public boolean esABB(){ // parte 
        if (hijoIzq != null){
            if (hijoIzq.getEtiqueta().compareTo(etiqueta) < 0){
                hijoIzq.esABB();
            }
            else{
                return false;
            }
        }
        if (hijoDer != null){
            if (hijoDer.getEtiqueta().compareTo(etiqueta) > 0){
                hijoDer.esABB();
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
