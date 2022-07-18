/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd4;

/**
 *
 * @author Rafael
 */
public class PD4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] ml = {{4,6,8},{5,9,11},{7,11,14}};  
        System.out.println(contains(ml,11));    //true
        System.out.println(contains(ml,1));     //false
    }
    
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch (AnyType[] a, AnyType x){ //Ejercicio 5.20
        if (a.length == 0){
            return -1;
        }
        int low = 0;
        int high = a.length -1;
        int mid;
        
        while(low<high){
            mid = (low+high) /2;
            
            if(a[mid].compareTo(x)<0)
                low = mid + 1;
            else
                high = mid;                         
        }
        if (a[low].compareTo(x)==0){
            return low;
        }
        return -1;
    }
    
    public static boolean contains(int [][]m,int val){  //Ejercicio 5.23
        int N = m.length;
        for(int r = 0; r<N; r++){
            for(int c=0; c<N; c++){
                if(m[r][c]==val){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean contaisBB(){  //Ejercicio 5.23 c
        return false;
    }
    
}
