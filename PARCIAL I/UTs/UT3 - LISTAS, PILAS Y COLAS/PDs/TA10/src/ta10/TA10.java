/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ta10;

/**
 *
 * @author Rafael
 */
public class TA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        
        emp.cargarSucursal("src\\ta10\\suc1.txt");
        System.out.println(emp.cantidadSucursales());
        emp.quitarSucursal("Chicago");
        //emp.listarSucursal();
        System.out.println(emp.cantidadSucursales());
        emp.clearAll();
        emp.cargarSucursal("src\\ta10\\suc2.txt");
        emp.listarSucursal();
        emp.quitarSucursal("Shenzen");
        emp.quitarSucursal("Tokio");
        emp.listarSucursal();
        System.out.println(emp.cantidadSucursales());
        emp.clearAll();
        emp.cargarSucursal("src\\ta10\\suc3.txt");
        emp.listarSucursal(";_");
        
        
        // Respuestas:
        
        /*
        
        1.- 107
        2.- Shenzhen
        3.- Ninguna de las anteriores, elimina solo el primer elemento con la palabra "Tokio"
        4.- Funciona !
        
        */
        
    }
    
}
