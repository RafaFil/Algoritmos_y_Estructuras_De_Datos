/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1_pd8;

/**
 *
 * @author Rafael
 */
public class Marcapaso {            //MEMORIA USADA
    
    public short presionSanguinea;  //16 bit
    public short frecuenciaCardiaca;//16 bit
    public short azucarEnSangre;  //16 bit
    
    public int maximaFuerza; //32 bit
    public float tiempoEntreLatidos; //32 bit
    public double bateriaRestante;  //64 bit
    public char[] codigoFabricante = new char[8]; //16 bit
    
    //TOTAL MEMORIA GASTADA: 192 bits = 24 MB
}
