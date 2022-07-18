/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_pd6;
import java.io.*;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class UT1_PD6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirTablero(7,7);
        leerEntradaArchivo("src\\ut1_pd6\\entrada.txt");
        leerEntradaStdin();
        
        int[] v1 = {1,2,3,4};
        int[] v2 = {0,1,3,1};
        System.out.println(multiplicacionVectores(v1,v2));
        
        
    }
    
    public static void imprimirTablero(int largo, int ancho){
        String sb = "";
        for (int i = 1; i<=ancho; i++){
            sb += "#";
        }
        for (int i = 1; i<=largo; i++){
            System.out.println(sb);
        }
        
    }
    
    public static void leerEntradaArchivo(String rutaArchivo){
        FileReader fr;
        String[] lineasArchivo = new String[3];
        int contador = 0;
    try {
         fr = new FileReader(rutaArchivo);
         BufferedReader br = new BufferedReader(fr);
         String lineaActual = br.readLine();
         
         while (lineaActual != null){
         lineasArchivo[contador] = lineaActual; 
         contador++;
         lineaActual = br.readLine();
         }
     } 
    catch (FileNotFoundException e) {
        System.out.println("Error al leer el archivo "+rutaArchivo);
        e.printStackTrace();
    } 
    catch (IOException e) {
        System.out.println("Error al leer el archivo "+rutaArchivo);
        e.printStackTrace();
    }
    
    
    System.out.println("El entero leído es: "+lineasArchivo[0]);
    System.out.println("El número de punto flotante es:: "+lineasArchivo[1]);
    System.out.println("La cadena leída es " + lineasArchivo[2]);
    
  }
    
    public static void leerEntradaStdin(){
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        r = sc.nextDouble();
        double area = r*r*Math.PI;
        double per = 2*r*Math.PI;
        
        System.out.println("Area del círculo: " + area + "\nel perimetro de la circunferencia: " + per);
    }  
    
    public static int multiplicacionVectores(int[] v1, int[] v2){
        // se toma v2 como vector columna
        if(v1.length == v2.length){
            int respuesta = 0;
            for (int i = 0; i<v1.length ; i++){
                respuesta += v1[i]*v2[i];
            }
            return respuesta;
        }
         throw new UnsupportedOperationException("Los vectores no son del mismo tamaño");
    }
    
    
    


}
    
    

    

