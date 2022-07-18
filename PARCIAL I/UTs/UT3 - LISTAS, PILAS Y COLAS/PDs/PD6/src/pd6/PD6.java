/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd6;

/**
 *
 * @author Rafael
 */
public class PD6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    // FALTA BUSCAR!!!!!
        
        // PRUEBA GENERALES
        
        Empresa eya = new Empresa("Estructura y Algoritmos");
        System.out.println(eya.esvacia());
        eya.cargarSucursales("src\\pd6\\sucursales.txt");
        eya.listarSucursales();
        eya.agregarSucursal("San gregorio");
        eya.listarSucursales();
        eya.quitarSucursal("San gregorio");
        eya.listarSucursales();
        eya.quitarSucursal("Coyote");
        eya.listarSucursales();
        System.out.println(eya.cantidadSucursales());
        System.out.println(eya.esvacia());

        // PRUEBA PROGRAMA (EJERCICIO)
        Empresa ej = new Empresa("Ejercicio");
        ej.cargarSucursales("src\\pd6\\suc1.txt");
        ej.listarSucursales();
        System.out.println(ej.cantidadSucursales()); // 108
        ej.quitarSucursal("Chicago");
        ej.listarSucursales();
        
        Empresa suc2 = new Empresa("suc2");
        suc2.cargarSucursales("src\\pd6\\suc2.txt");
        
        Empresa ej2 = new Empresa("Suc3");
        ej2.cargarSucursales("src\\pd6\\suc3.txt");
        ej2.listarSucursales(";_");
        
    }
    
}
