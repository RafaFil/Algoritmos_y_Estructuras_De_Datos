/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_equipo6;

/**
 *
 * @author gatom
 */
public class UT1_TA3_subB {
    
    public static void ejercicioB(){
        long n = 23;
        int sumando = 0;
        int resultado = 0;
     
        if (UtilMath.isPrime(n))
        {
            do {
                resultado += sumando;
                sumando += 2;
            }while(sumando <= resultado);
            System.out.println(resultado);
        }
        else
        {
            sumando++;
            do {
                resultado += sumando;
                sumando += 2;
            }while(sumando <= resultado);
            System.out.println(resultado);
        }
    }
}
