package aed.tdatrieHash;

import java.util.LinkedList;

public class TArbolTrieHash {
    
    private TTrieNodoHashMap raiz;

    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TTrieNodoHashMap();
        }
        raiz.insertar(palabra);
    }

    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    public LinkedList<String> predecir(String prefijo) {
        if (raiz != null) {
            LinkedList<String> palabras = new LinkedList<String>();
            raiz.predecir(prefijo,palabras);
            return palabras;
        }
        return null;
    }

    public int buscar(String palabra) {
        if (raiz != null) {
            return raiz.buscar(palabra);
        }
        return 0;
    }
}
