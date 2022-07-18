/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TDAconjunto;
import TDAlist.*;

/**
 *
 * @author Rafael
 * @param <T>
 */
public interface IConjunto<T> extends ILista<T> {
    
    public IConjunto<T> union(IConjunto<T> otroConjunto);
    
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto);
}
