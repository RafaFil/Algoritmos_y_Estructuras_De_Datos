package aed.pd3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TGrafoDirigido implements IGrafoDirigido {

    private Map<Comparable, TVertice> vertices; // vertices del grafo.-

    public TGrafoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        this.vertices = new HashMap<>();
        for (TVertice vertice : vertices) {
            insertarVertice(vertice.getEtiqueta());
        }
        for (TArista arista : aristas) {
            insertarArista(arista);
        }
    }

    /**
     * Metodo encargado de eliminar una arista dada por un origen y destino. En caso de no existir la adyacencia, retorna falso. En caso de que las etiquetas sean invalidas, retorna falso.
     *
     */
    public boolean eliminarArista(Comparable nomVerticeOrigen, Comparable nomVerticeDestino) {
        if ((nomVerticeOrigen != null) && (nomVerticeDestino != null)) {
            TVertice vertOrigen = buscarVertice(nomVerticeOrigen);
            if (vertOrigen != null) {
                return vertOrigen.eliminarAdyacencia(nomVerticeDestino);
            }
        }
        return false;
    }

    /**
     * Metodo encargado de verificar la existencia de una arista. Las etiquetas pasadas por par�metro deben ser v�lidas.
     *
     * @return True si existe la adyacencia, false en caso contrario
     */
    public boolean existeArista(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        TVertice vertOrigen = buscarVertice(etiquetaOrigen);
        TVertice vertDestino = buscarVertice(etiquetaDestino);
        if ((vertOrigen != null) && (vertDestino != null)) {
            return vertOrigen.buscarAdyacencia(vertDestino) != null;
        }
        return false;
    }

    /**
     * Metodo encargado de verificar la existencia de un vertice dentro del grafo.-
     *
     * La etiqueta especificada como par�metro debe ser v�lida.
     *
     * @param unaEtiqueta Etiqueta del vertice a buscar.-
     * @return True si existe el vertice con la etiqueta indicada, false en caso contrario
     */
    public boolean existeVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta) != null;
    }

    /**
     * Metodo encargado de verificar buscar un vertice dentro del grafo.-
     *
     * La etiqueta especificada como parametro debe ser valida.
     *
     * @param unaEtiqueta Etiqueta del vertice a buscar.-
     * @return El vertice encontrado. En caso de no existir, retorna nulo.
     */
    private TVertice buscarVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta);
    }

    /**
     * Metodo encargado de insertar una arista en el grafo (con un cierto costo), dado su vertice origen y destino.- Para que la arista sea valida, se deben cumplir los siguientes casos: 1) Las etiquetas pasadas por parametros son v�lidas.- 2) Los vertices (origen y destino) existen dentro del grafo.- 3) No es posible ingresar una arista ya existente (miso origen y mismo destino, aunque el costo sea diferente).- 4) El costo debe ser mayor que 0.
     *
     * @return True si se pudo insertar la adyacencia, false en caso contrario
     */
    public boolean insertarArista(TArista arista) {
        if ((arista.getEtiquetaOrigen() != null) && (arista.getEtiquetaDestino() != null)) {
            TVertice vertOrigen = buscarVertice(arista.getEtiquetaOrigen());
            TVertice vertDestino = buscarVertice(arista.getEtiquetaDestino());
            if ((vertOrigen != null) && (vertDestino != null)) {
                return vertOrigen.insertarAdyacencia(arista.getCosto(), vertDestino);
            }
        }
        return false;
    }

    /**
     * Metodo encargado de insertar un vertice en el grafo.
     *
     * No pueden ingresarse vertices con la misma etiqueta. La etiqueta especificada como par�metro debe ser v�lida.
     *
     * @param unaEtiqueta Etiqueta del vertice a ingresar.
     * @return True si se pudo insertar el vertice, false en caso contrario
     */
    public boolean insertarVertice(Comparable unaEtiqueta) {
        if ((unaEtiqueta != null) && (!existeVertice(unaEtiqueta))) {
            TVertice vert = new TVertice(unaEtiqueta);
            getVertices().put(unaEtiqueta, vert);
            return getVertices().containsKey(unaEtiqueta);
        }
        return false;
    }

    @Override

    public boolean insertarVertice(TVertice vertice) {
        Comparable unaEtiqueta = vertice.getEtiqueta();
        if ((unaEtiqueta != null) && (!existeVertice(unaEtiqueta))) {
            getVertices().put(unaEtiqueta, vertice);
            return getVertices().containsKey(unaEtiqueta);
        }
        return false;
    }

    public Object[] getEtiquetasOrdenado() {
        TreeMap<Comparable, TVertice> mapOrdenado = new TreeMap<>(this.getVertices());
        return mapOrdenado.keySet().toArray();
    }

    /**
     * @return the vertices
     */
    public Map<Comparable, TVertice> getVertices() {
        return vertices;
    }

    @Override
    public Comparable centroDelGrafo() {
        Double[][] a = this.floyd();

        LinkedList<Comparable> exen = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            Double maximo = 0.0;
            for (int k = 0; k < a.length; k++) {
                if (a[k][i] > maximo && a[k][i] != Double.MAX_VALUE) {
                    maximo = a[k][i];
                }
            }
            exen.add(maximo);

        }
        exen.remove(0.0);
        System.out.println(exen);
        return Collections.min(exen);

    }

    @Override
    public Double[][] floyd() {
        Double[][] a = UtilGrafos.obtenerMatrizCostos(this.vertices);
        for (int k = 0; k < a.length; k++) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][k] + a[k][j] < a[i][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }

        return a;
    }

    @Override
    public Comparable obtenerExcentricidad(Comparable etiquetaVertice) {
        Double[][] a = this.floyd();
        Double maximo = 0.0;
        /*for (int i = 0; i < a.length; i++) {
            for (int k = 0; k <a.length; k++){
                if(a[k][i] > maximo){
                    maximo = a[k][i];
                }
            }
        }*/
        return maximo;

    }

    @Override
    public boolean[][] warshall() {
        Double[][] c = UtilGrafos.obtenerMatrizCostos(getVertices());
        boolean[][] warshall = new boolean[c.length][c.length];
        // Cambiamos todos los valores de la matriz de costo por valores boleanos
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                warshall[i][j] = false;

                if (i != j && c[i][j] != Double.MAX_VALUE) {
                    warshall[i][j] = true;
                }
            }
        }
        // Floyd con warshall
        for (int k = 0; k < c.length; k++) {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    if ((i != k) && (k != j) && (i != j)) {
                        if (!warshall[i][j]) {
                            warshall[i][j] = warshall[i][k] && warshall[k][j];
                        }
                    }
                }
            }
        }
        return warshall;
    }

    @Override
    public boolean eliminarVertice(Comparable nombreVertice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //----------------------------------EJERCICIO 2---------------------------------------
    public boolean existeCamino(Comparable origen, Comparable destino) {
        boolean[][] warshal = this.warshall();
        Set<Comparable> etiquetas = vertices.keySet();
        int i = 0;
        int j = 0;
        for (Comparable etiqueta : etiquetas) {
            if (etiqueta.equals(origen)) {
                break;
            }
            i += 1;
        }
        for (Comparable etiqueta : etiquetas) {
            if (etiqueta.equals(destino)) {
                break;
            }
            j += 1;
        }    
        
        return warshal[i][j];
    }

    // ---------------------------------EJERCICIO 3---------------------------------------
    public void desvisitarVertices() {
        Collection<TVertice> vertices = this.vertices.values();
        for (TVertice vertice : vertices) {
            vertice.setVisitado(false);
        }
    }

    public Collection<TVertice> bpf() {
        desvisitarVertices();
        LinkedList<TVertice> busqueda = new LinkedList<TVertice>();
        Collection<TVertice> vertices = this.vertices.values();
        for (TVertice vertice : vertices) {
            if (!vertice.getVisitado()) {
                vertice.bpf(busqueda);
            }
        }
        return busqueda;
    }

    public Collection<TVertice> bpf(Comparable origen) {
        desvisitarVertices();
        TVertice verticeOrigen = this.buscarVertice(origen);
        LinkedList<TVertice> listaBusqueda = new LinkedList<TVertice>();
        if (verticeOrigen != null) {
            verticeOrigen.bpf(listaBusqueda);
        } else {
            System.out.println("No existe vertice con la etiqueta indicada.");
        }

        return listaBusqueda;
    }

}
