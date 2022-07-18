
import java.util.Collection;
import java.util.LinkedList;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TGrafoNoDirigido gkb = UtilGrafos.cargarGrafo("./src/actores.txt", "./src/en_pelicula.txt", false, TGrafoNoDirigido.class);

        String actorZZ1 = "Robin_Wright"; // se indicará en el pizarrón
        Collection<TVertice> contactos1 = gkb.listarContactos(actorZZ1, 1);
        // escribir los resultados al archivo "salida.txt"
        String[] contactos1str = new String[contactos1.size()];
        for (int i = 0; i < contactos1.size(); i++) {
            contactos1str[i] = ((TVertice) contactos1.toArray()[i]).getEtiqueta().toString();
        }
        ManejadorArchivosGenerico.escribirArchivo("./src/salida.txt", contactos1str);

        String actorZZ2 = "Robert_Niro"; // se indicará en el pizarrón
        Collection<TVertice> contactos2 = gkb.listarContactos(actorZZ2, 2);

        String[] aux = {"\n-------------------------------\n"};
        ManejadorArchivosGenerico.escribirArchivo("./src/salida.txt", aux );
        
        String[] contactos2str = new String[contactos2.size()];

        for (int i = 0; i < contactos2.size(); i++) {
            contactos2str[i] = ((TVertice) contactos2.toArray()[i]).getEtiqueta().toString();
        }
        ManejadorArchivosGenerico.escribirArchivo("./src/salida.txt", contactos2str);

        // escribir los resultados al archivo "salida.txt"
        // emitir un archivo de salida, "salida.txt" con la lista de contactos obtenida
    }
}
