/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jechague
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear una tabla de tipo THash e insertar las claves del archivo "claves_insertar.txt"
        
        String[] aux = ManejadorArchivosGenerico.leerArchivo(".//src//claves_insertar.txt");
        
        Double tamanio = aux.length / 0.75; // 266
        //System.out.println(tamanio.intValue());
        
        Hash hash = new Hash(tamanio.intValue());
        
        for (String str : aux){
            //System.out.println(hash.funcionHashing(Integer.valueOf(str)));
            
            hash.insertar(Integer.valueOf(str));
        }
        
        
        
        
        // Buscar en la tabla creada anteriormente las claves indicadas en el archivo "claves_buscar.txt"
        
        aux = ManejadorArchivosGenerico.leerArchivo(".//src//claves_buscar.txt");
        for (String str : aux){
            hash.buscar(Integer.valueOf(str));
        }
        
    }
    
}
