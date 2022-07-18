import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolTrieTelefonos trieAbonados = new TArbolTrieTelefonos();

       // CARGAR EN EL TRIE LOS TELÉFONOS Y NOMBRES A PARTIR DEL ARCHIVO ABONADOS.TXT
        String[] abonados = ManejadorArchivosGenerico.leerArchivo(".//src//abonados.txt");

        for (String str : abonados) {
            String[] aux = str.split(",");
            TAbonado abonado = new TAbonado(aux[1], aux[0]);
            trieAbonados.insertar(abonado);
        }
        
        String codigoPais = "598" ; // utilizar el indicado en el archivo "codigos.txt"
        String codigoArea = "93" ;// utilizar el indicado en el archivo "codigos.txt"
        LinkedList<TAbonado> ab = trieAbonados.buscarTelefonos(codigoPais, codigoArea);
        System.out.println(ab.toString());
        // crear el archivo "salida.txt", con los abonados (1 por linea) 
        // correspondientes al pais y area 
        // imprimir Nombre y teléfono, 
        // ordenados alfabeticamente por nombre
        

      
        
    }
}