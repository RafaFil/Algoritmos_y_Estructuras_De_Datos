/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pd9;
import java.util.Stack;

/**
 *
 * @author Rafael
 */
public class Expresion {
    
    
    public boolean controlCaracteres(char[] listaCaracteres){
        Stack pila= new Stack();
        for (int i=0; i<listaCaracteres.length ; i++){
            if (listaCaracteres[i]=='{'){
                pila.push('{');
            }
            else if (listaCaracteres[i]=='}'){
                if (pila.empty()){
                    return false;
                }
                pila.pop();
            }
        }
        
        
        return pila.empty();
    }
}
