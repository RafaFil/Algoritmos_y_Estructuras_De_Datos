/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_equipo6;

/**
 *
 * @author gatom
 */
public class UtilMath {
    
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
    
    public static int factorial(int num){
        if(num >= 0){
            int fact=1;
            for(int i = 1; i<=num ; i++){
                fact *=i;
            }
            return fact;
        }
        return 0;
    }
} 
