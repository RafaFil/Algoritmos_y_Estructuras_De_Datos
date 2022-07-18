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

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        if (hijoIzq != null){
            if (unaEtiqueta.compareTo(etiqueta) < 0) {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }
        if (unaEtiqueta.compareTo(etiqueta)>0){
            if(hijoDer != null){
                hijoDer = hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }
        return quitaElNodo();
    }
    
    private TElementoAB quitaElNodo(){
        if (hijoIzq == null){
            return hijoDer;
        }
        if (hijoDer == null){
            return hijoIzq;
        }
        TElementoAB elHijo = hijoIzq;
        TElementoAB elPadre = this;
        while(elHijo.hijoDer != null){
            elPadre = elHijo;
            elHijo = elHijo.hijoDer;
        }
        if (elPadre == this){
            elPadre.hijoDer = elHijo.hijoIzq;
            elHijo.hijoIzq =  hijoIzq;
        }
        elHijo.hijoIzq = hijoIzq;
        return elHijo;
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
    
    public int obtenerAltura() {
        if (this == null) {
            return -1;
        } else {
            return 1 + Math.max(this.getHijoIzq().obtenerAltura(), this.getHijoDer().obtenerAltura());
        }
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
