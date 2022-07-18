/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pd9;

/**
 *
 * @author Rafael
 */
public class PD9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] caract1 = {'{','}','{','{','}','}'};
        char[] caract2 = {'{','{','{'};
        
        Expresion expres = new Expresion();
        
        System.out.println(expres.controlCaracteres(caract1));
        System.out.println(expres.controlCaracteres(caract2));
    }
    
}
