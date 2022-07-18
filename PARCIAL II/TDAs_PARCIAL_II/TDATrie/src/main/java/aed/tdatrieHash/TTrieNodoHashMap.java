package aed.tdatrieHash;

import java.util.HashMap;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class TTrieNodoHashMap {
    
    private static final int CANT_CHR_ABECEDARIO = 26;
    private HashMap hijos;
    private boolean esPalabra;

    public TTrieNodoHashMap() {
        this.hijos = new HashMap();
        this.esPalabra = false;
    }

    public void insertar(String unaPalabra) {
        TTrieNodoHashMap nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            if (!nodo.hijos.containsKey(unaPalabra.charAt(c))) {
                nodo.hijos.put(unaPalabra.charAt(c), new TTrieNodoHashMap());
            }
            nodo = (TTrieNodoHashMap) nodo.hijos.get(unaPalabra.charAt(c));
        }
        nodo.esPalabra = true;
    }

    private void imprimir(String s, TTrieNodoHashMap nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);
            }
            char key;
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                key = (char) (c + 'a');
                if (nodo.hijos.containsKey(key)) {
                    imprimir(s + key, (TTrieNodoHashMap) nodo.hijos.get(key));
                }
            }
        }
    }

    public void imprimir() {
        imprimir("", this);
    }

    private void predecir(String s, String prefijo, LinkedList<String> palabras, TTrieNodoHashMap nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                palabras.add(prefijo + s);
            }
            char key;
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                key = (char) (c + 'a');
                if (nodo.hijos.containsKey(key)) {
                    predecir(s + key, prefijo, palabras, (TTrieNodoHashMap) nodo.hijos.get(key));
                }
            }
        }
    }

    public void predecir(String prefijo, LinkedList<String> palabras) {
        TTrieNodoHashMap nodo = buscarNodoTrie(prefijo);
        predecir("", prefijo, palabras, nodo);
    }

    private TTrieNodoHashMap buscarNodoTrie(String s) {
        TTrieNodoHashMap nodo = this;
        for (int c = 0; c < s.length(); c++) {
            if (!nodo.hijos.containsKey(s.charAt(c))) {
                return null;
            }
            nodo = (TTrieNodoHashMap) nodo.hijos.get(s.charAt(c));
        }
        return nodo;
    }

    public int buscar(String s) {
        TTrieNodoHashMap nodo = this;
        int temp = 0;
        for (int c = 0; c < s.length(); c++) {
            temp++;
            if (!nodo.hijos.containsKey(s.charAt(c))) {
                return -temp;
            }
            nodo = (TTrieNodoHashMap) nodo.hijos.get(s.charAt(c));
        }
        if (nodo.esPalabra) {
            return temp;
        }
        return -temp;
    }
    
}
