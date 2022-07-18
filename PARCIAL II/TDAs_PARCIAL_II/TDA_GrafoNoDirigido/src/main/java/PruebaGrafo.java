
import java.util.Collection;

public class PruebaGrafo {

    public static void main(String[] args) {
        TGrafoNoDirigido gnd = UtilGrafos.cargarGrafo("./src/main/java/aeropuertos_2.txt", "./src/main/java/conexiones_2.txt",
                false, TGrafoNoDirigido.class);

        Object[] etiquetasarray = gnd.getEtiquetasOrdenado();

        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gnd.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, gnd.getVertices(), "Matriz de Adyacencias");

        TCaminos caminos = gnd.todosLosCaminos("Asuncion", "Montevideo");

        gnd.tieneCiclo("San_Pablo");

        caminos.imprimirCaminosConsola();
        
        System.out.println(gnd.esConexo());
                
        gnd.Prim();
    }
}
