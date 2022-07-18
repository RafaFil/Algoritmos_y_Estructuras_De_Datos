/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ta10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class Empresa {
    
    private LinkedList<String> sucursales = new LinkedList();
    
    public void cargarSucursal(String path){
                FileReader fr;
        try {
            fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                sucursales.add(lineaActual);
                lineaActual = br.readLine();
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + path);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + path);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
    }
    
    public boolean buscarSucursal(String toSearch){
        return sucursales.contains(toSearch);
    }
    public void quitarSucursal(String elementoAeliminar){
        sucursales.remove(elementoAeliminar);
    }
    public void listarSucursal(){
       sucursales.forEach((n) -> System.out.println(n));
    }
    public int cantidadSucursales(){
        return sucursales.size();
    }
    public boolean isEmpty(){
        return sucursales.isEmpty();
    }
    
    public void clearAll(){
        sucursales.clear();
    }
    
    public void listarSucursal(String separador){

       sucursales.forEach((n) -> System.out.println(n + " "+ separador));
    }
    
}
