/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd2;

/**
 *
 * @author Rafael
 */
public class PD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(4)+" "+factorial(2)+" "+factorial(0));
        int[] A = {4,3,6,2,5};
        int[] B = {};
        System.out.println(sumaLineal(A,5));
        System.out.println(potencia(2,-1));
        String[] C = {"a","b","c","d"};
        String[] Q ={};
        String[] D = invertirArr(C,0,C.length-1);
        System.out.println(D[0]);
        System.out.println(D[1]);
        System.out.println(D[2]);
        System.out.println(D[3]);
        
    }
    
    public static int factorial(int n){ //Ejercicio 1
        if (n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    public static int sumaLineal(int[] A, int n){ //Ejercicio 2
        if (n==1){
            return A[0];
        }
        else{
            return sumaLineal(A,n-1) + A[n-1];
        }
    }
    
    public static float potencia(int base,int exponente){ //Ejercico 3
        if ( exponente == 0){
            return 1;
        }
        else if(exponente < 0){
            return potencia(base,exponente+1)/base;
        }
        else{
            return base*potencia(base,exponente-1);
        }
    }
    
    public static String[] invertirArr(String[] arr, int i, int j){ //Ejercicio 4

        if(i<j){

            String valI = arr[i];
            String valJ = arr[j];
            arr[i]=valJ;
            arr[j]=valI;
            invertirArr(arr,i+1,j-1);
        }

        return arr;
        
    }
    
    
}
