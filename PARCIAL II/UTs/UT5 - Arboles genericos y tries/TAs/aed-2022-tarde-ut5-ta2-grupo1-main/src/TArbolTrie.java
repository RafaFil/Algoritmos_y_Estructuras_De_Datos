

import java.util.LinkedList;


public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        return this.buscar1(palabra);
    }
    
    public int buscar1(String palabra){
        if (this.raiz == null) {
            return 0;
        } else {
            return raiz.buscar(palabra);
        }
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
