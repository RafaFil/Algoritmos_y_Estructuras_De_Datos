/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd5;
import java.util.*;

/**
 *
 * @author Rafael
 */
public class PD6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println(fiboTD(9,memo));
        System.out.println(fiboUB(9));

    }
    
    
    
    public static int fiboTD(int n, Map<Integer,Integer> memo){   //Ejercicio 1
              
        if (!memo.containsKey(n)){
            if (n <= 2){
                memo.put(n,1);
            }
            else{
                memo.put(n,(fiboTD(n-1,memo)+fiboTD(n-2,memo)));
            }
        }
        return memo.get(n);
    }
    
    public static int fiboUB(int n){    //Ejercicio 2
        if(n==0){
            return 0;
        }
        else{
            int fibAnterior = 0;    
            int fibActual = 1;      
            int fibNuevo;           
            for (int i=1 ; i<n ; i++){  
                fibNuevo = fibActual + fibAnterior;
                fibAnterior = fibActual;
                fibActual = fibNuevo;
            }
            
            return fibActual;
            
        }
    }
    
}
