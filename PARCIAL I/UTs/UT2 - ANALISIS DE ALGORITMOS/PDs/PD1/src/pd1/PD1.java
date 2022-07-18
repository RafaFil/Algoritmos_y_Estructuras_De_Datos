/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd1;

/**
 *
 * @author Rafael
 */
public class PD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        
        miFuncion(arr);
        
    }
    
    public static void miFuncion(int[] ar){
        int n = ar.length;
        System.out.println(n);
        int cont1=0;
        int cont2=0;
        for (int i=1;i<=n-1;i++){
            cont1++;
            for (int j=n; j<=i+1; j++){
                cont2++;
                /*if (ar[j]<ar[j-1]){
                    
                }*/
            }
        }
        System.out.println("bucle ext "+cont1);
        System.out.println("bucle int"+cont2);
    }
    
}
