
import java.util.Collection;

import java.util.LinkedList;

public class TAristas extends LinkedList<TArista> {

    private final static String SEPARADOR_ELEMENTOS_IMPRESOS = "-";
    //private Collection<TArista> aristas  = new LinkedList<TArista>();

    /**
     * Busca dentro de la lista de aristas una arista que conecte a etOrigen con etDestino
     *
     * @param etOrigen
     * @param etDestino
     * @return
     */
    public TArista buscar(Comparable etOrigen, Comparable etDestino) {
        for (TArista a : this) {
            if (a.getEtiquetaOrigen().compareTo(etOrigen) == 0 && a.getEtiquetaDestino().compareTo(etDestino) == 0) {
                return a;
            }
        }

        return null;
    }

    /**
     * Busca la arista de menor costo que conecte a cualquier nodo de VerticesU con cualquier otro de VerticesV y cuyo costo sea el minimo
     *
     * @param VerticesU - Lista de vertices U
     * @param VerticesV - Lista de vertices V
     * @return
     */
    public TArista buscarMin(Collection<Comparable> VerticesU, Collection<Comparable> VerticesV) {

        TArista tAMin = null;
        Double costoMin = Double.MAX_VALUE;
        for (Comparable u : VerticesU) {
            for (Comparable v : VerticesV) {
                TArista tA = buscar(u, v);
                if (tA != null && tA.getCosto() < costoMin) {
                    tAMin = tA;
                    costoMin = tA.getCosto();
                }
            }
        }
        return tAMin;
    }

    public String imprimirEtiquetas() {
        if (this.isEmpty()) {
            return null;
        }
        StringBuilder salida = new StringBuilder();
        for (TArista a : this){ 
            salida.append
        (a.getEtiquetaOrigen()).append(SEPARADOR_ELEMENTOS_IMPRESOS).append(a.getEtiquetaDestino()).append(SEPARADOR_ELEMENTOS_IMPRESOS).append(a.getCosto()).append
        (   "\n");
        }
        return salida.toString();
    }

    void insertarAmbosSentidos(Collection<TArista> aristas) {
        TArista tempArista;
        for (TArista ta : aristas) {
            this.add(ta);
            this.add(ta.aristaInversa());
        }
    }

}
