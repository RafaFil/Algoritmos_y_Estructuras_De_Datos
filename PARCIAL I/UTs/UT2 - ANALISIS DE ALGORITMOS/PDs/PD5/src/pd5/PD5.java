/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd5;

/**
 *
 * @author Rafael
 */
public class PD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] arr ={false,false,false,false,true,false,false,false,false,false,true,false,true,false,false,false,false,false};
        boolean[] arr2 ={false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
        System.out.println(hasTwoTrueValues1(arr));
        System.out.println(hasTwoTrueValues2(arr));
        System.out.println(hasTwoTrueValues3(arr));
        System.out.println(hasTwoTrueValues1(arr2));
        System.out.println(hasTwoTrueValues2(arr2));
        System.out.println(hasTwoTrueValues3(arr2));
    }
    
    public static boolean hasTwoTrueValues1(boolean[] arr){ //Ej 5.24 A
        int count = 0;
        for (int i =0; i <arr.length; i++){
            if (arr[i]){
                count++;
            }
        }
        return count >=2;
    }
    
    public static boolean hasTwoTrueValues2(boolean[] arr){ //Ej 5.24 B
        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] && arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean hasTwoTrueValues3(boolean[] arr){ //Ej 5.24 C
        for (int i = 0; i< arr.length; i++){
            if(arr[i]){
                for(int j = i+1; j<arr.length; j++){
                    if( arr[j])
                        return true;
                }
            }
        }
        return false;
    }
    
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[]a, AnyType x){
        int low = 0;
        int high = a.length -1;
        int mid;
        
        while ( low <= high)
        {
            mid = (low + high)/2;
            
            if (a[mid].compareTo(x)<0)
                low = mid+1;
            else if( a [mid].compareTo (x) > 0)
                high = mid -1;
            else
                return mid;
        }
        
        return -1; //NOT FOUND
    }
        

    
}
