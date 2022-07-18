/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd6;
import TDAList.Lista;
import TDAList.Nodo;
import java.io.*;

/**
 *
 * @author Rafael
 */
public class Empresa {
    private final String name;
    
    private Lista lista = new Lista();
    
    public Empresa(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    public void agregarSucursal(String sucursal){
        lista.insertar(new Nodo(sucursal,sucursal));
        
    }
    
    public void quitarSucursal(String sucursal){
        lista.eliminar(sucursal);
    }
    
    public void listarSucursales(){
        System.out.println(lista.imprimir());
    }
    
    public void listarSucursales(String separador){
        System.out.println(lista.imprimir(separador));
    }
    
    public int cantidadSucursales(){
        return lista.cantElementos();
    }
    
    public boolean esvacia(){
        return lista.esVacia();
    }
    
    public void cargarSucursales(String path){
        FileReader fr;
        try {
            fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                Nodo nodo = new Nodo(lineaActual,lineaActual);
                lista.insertar(nodo);
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
    
    
    
    
    
    
}
