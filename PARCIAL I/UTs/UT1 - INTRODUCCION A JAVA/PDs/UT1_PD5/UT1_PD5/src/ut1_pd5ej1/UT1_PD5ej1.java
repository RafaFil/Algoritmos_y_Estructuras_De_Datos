/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_pd5ej1;

/**
 *
 * @author Rafael
 */
public class UT1_PD5ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        
        palindromo.palindromo("Tod saw, i was Dot.");
        
        String[] ej4 = {"13.4","66.1"};
        
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.conversion(ej4);
        
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.toStringDemo();
        
        //EJERCICIO 6
        
        String ej6 = " Hola Mundo ";
        System.out.println(ej6.substring(7));
        System.out.println(ej6.substring(4,7));
        System.out.println(ej6.split(ej6, 0));
        System.out.println(ej6.subSequence(3,5));
        System.out.println(ej6.trim());
        System.out.println(ej6.toLowerCase());
        System.out.println(ej6.toUpperCase());
        System.out.println(ej6.indexOf("o"));
        System.out.println(ej6.lastIndexOf("o"));
        System.out.println(ej6.contains("Hola"));
        System.out.println(ej6.replace("o","a"));
        System.out.println(ej6.replaceAll("o", "a"));
        System.out.println(ej6.replaceFirst("o", "a"));
        
        //EJERCICIO 7:
        
        StringBuilder sb = new StringBuilder("Esto es un string builder");
        //sb.setLength(2);
        //System.out.println(sb.length());
        sb.ensureCapacity(16);
        System.out.println(sb.capacity());
        sb.append(" hola");
        sb.insert(8, "oo00");
        System.out.println(sb);
        sb.delete(8,12);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        System.out.println(sb.reverse());
        
        


        
    }
    
}
