/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Rafael
 */
public class Hash implements IHash {
    
    private int tamanio;
    private Integer[] tablaHash;
    private int cantElementos = 0;
    
    
    public Hash(){
        this.tamanio = 25;
        tablaHash = new Integer[this.tamanio];
    }
    public Hash(int tamanio){
        
        this.tamanio = tamanio;
        tablaHash = new Integer[this.tamanio];
    }

    @Override
    public int buscar(int unaClave) {
        int cont = 0;
        int h = this.funcionHashing(unaClave);
        
        while (tablaHash[h] != null && tablaHash[h] != unaClave ){
            cont++;
            h++;
        }
        
        return cont;
    }

    @Override
    public int insertar(int unaClave) {
        int cont = 0;
        int h = this.funcionHashing(unaClave);
        //System.out.println(h);
        
        while (tablaHash[h] != null && tablaHash[h] != unaClave){
            cont++;
            h++;
        }
        
        tablaHash[h]=unaClave;
        cantElementos++;
        
        System.out.println(cantElementos);
        if( cantElementos / tamanio >= 0.7){
            System.out.println("toca redim");
            //this.reDim(); -> reDimensionar
        }
        return cont;
    }

    @Override
    public int funcionHashing(int unaClave) {
       return unaClave % tamanio;
    }
    
    private void reDim(){
        this.tamanio = this.tamanio + 10;
        // ver como dimensionar;
        
    }
    
}
