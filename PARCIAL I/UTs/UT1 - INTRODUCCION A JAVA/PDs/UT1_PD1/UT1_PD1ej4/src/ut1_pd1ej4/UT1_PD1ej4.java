/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_pd1ej4;
/**
 *
 * @author Rafael
 */
public class UT1_PD1ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        recorrer("Esta es una prueba");
        getValor();
        getPrimerCaracter("Camblor");
        paraAString(15);
}
    public static int recorrer (String cadena) {
    int res = 0;
    for (int i = 1; i <= cadena.length()-1; i++) {  // SE AGREGA EL -1
    if (cadena.charAt(i) != ' ') {
    res++;
    }
    }
    return res;
    }
    public static int getValor() {
    int vector[] = { 6, 16, 26,36,46,56,66,76 };
    int idx = 7;    // SE CAMBIA DE 8 A 7, PARA HACER REFERENCIA CORRECTA AL ULTIMO INDICE DEL VECTOR
    return vector[idx];
    }
    public static char getPrimerCaracter(String palabra) {
    //String string[] = new String[5];  // INECESARIO
    return (palabra.charAt(1)); // SE USA EL METODO charAT() SOBRE EL PARAMETRO MISMO
    }
    public static String paraAString(int a) {
    Integer x1= a;  // SE ASIGNA DIRECTAMENTE COMO INTEGER
    return x1.toString() ;  // SE UTILIZA UN METODO DE LA CLASE INTEGER

    }
    
}
