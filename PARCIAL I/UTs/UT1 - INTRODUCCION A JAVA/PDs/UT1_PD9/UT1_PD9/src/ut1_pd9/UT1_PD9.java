/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut1_pd9;

/**
 *
 * @author Rafael
 */
public class UT1_PD9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(isPrime(13));
    }
    
    public static int factorial(int num){   //EJERCICIO 1
        int resultado = 1;
        if (num>0){
          for (int i=1; i<=num;i++){
              resultado *=i ;
          }
          return resultado;  
        }
        else if (num == 0){
            return resultado;
        }
        throw new java.lang.UnsupportedOperationException("Negative number");
    }

    public static boolean isPrime(long n){
    if (n == 1 || n == 0 || n < 0){
        return false;
    }

    int i = 2;
    while (i<n){
        if (n%i == 0){
            return false;
        }
        i++;
    }

    return true;
    }

    public static void ejercicioB(int n){
        int sumando = 0;
        int resultado = 0;

        if (isPrime(n))
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
