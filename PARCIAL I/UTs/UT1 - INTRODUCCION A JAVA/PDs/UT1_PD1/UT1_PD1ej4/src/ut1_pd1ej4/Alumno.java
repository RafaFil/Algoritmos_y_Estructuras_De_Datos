/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd1ej4;

/**
 *
 * @author Rafael
 */
public class Alumno {

    private String nombre;
    public Alumno () {
    nombre = "juan";    //SE LE ASIGNA UN NOMBRE POR DEFECTO, OTRA SOLUCION ES QUE EL CONSTRUCTOR RECIVA UN PARAMETRO Y LO ASIGNE
    }
    public String getNombreAdmiracion() {
    return nombre.concat("!");
}
}
