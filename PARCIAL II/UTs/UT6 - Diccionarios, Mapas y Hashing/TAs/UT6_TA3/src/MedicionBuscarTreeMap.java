
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class MedicionBuscarTreeMap extends Medible {
    
    private TreeMap treeMap;

    public MedicionBuscarTreeMap(TreeMap treeMap) {
        this.treeMap = treeMap;
    }
        
    
    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for(int i = 0; i < repeticion; i++){
            for(String palabra : palabras){
                treeMap.containsKey(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.treeMap;
    }
    
}
