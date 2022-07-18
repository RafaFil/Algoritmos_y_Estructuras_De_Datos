/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd8;

/**
 *
 * @author Rafael
 */
public class PD8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa ej = new Empresa();
        
        ej.cargarSucursal("src\\pd8\\sucursales.txt");
        ej.listarSucursal();
        System.out.println(ej.cantidadSucursales());
        System.out.println(ej.isEmpty());
        ej.quitarSucursal("Montevideo");
        ej.listarSucursal();
        
    }
    
}
