
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TGrafoDirigido implements IGrafoDirigido {

    private final Map<Comparable, TVertice> vertices; //lista de vertices del grafo.-

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
     * @param nomVerticeOrigen
     * @param nomVerticeDestino
     * @return
     */
    @Override
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
     * Metodo encargado de eliminar un vertice en el grafo. En caso de no existir el v�rtice, retorna falso. En caso de que la etiqueta sea inv�lida, retorna false.
     *
     * @param nombreVertice
     * @return
     */
    @Override
    public boolean eliminarVertice(Comparable nombreVertice) {
        if (nombreVertice != null) {
            getVertices().remove(nombreVertice);
            return getVertices().containsKey(nombreVertice);
        }
        return false;
    }

    /**
     * Metodo encargado de verificar la existencia de una arista. Las etiquetas pasadas por par�metro deben ser v�lidas.
     *
     * @param etiquetaOrigen
     * @param etiquetaDestino
     * @return True si existe la adyacencia, false en caso contrario
     */
    @Override
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
     * @param unaEtiqueta Etiqueta del v�rtice a buscar.-
     * @return True si existe el vertice con la etiqueta indicada, false en caso contrario
     */
    @Override
    public boolean existeVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta) != null;
    }

    /**
     * Metodo encargado de verificar buscar un vertice dentro del grafo.-
     *
     * La etiqueta especificada como parametro debe ser valida.
     *
     * @param unaEtiqueta Etiqueta del v�rtice a buscar.-
     * @return El vertice encontrado. En caso de no existir, retorna nulo.
     */
    protected TVertice buscarVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta);
    }

    /**
     * Matodo encargado de insertar una arista en el grafo (con un cierto costo), dado su vertice origen y destino.- Para que la arista sea valida, se deben cumplir los siguientes casos: 1) Las etiquetas pasadas por parametros son v�lidas.- 2) Los vertices (origen y destino) existen dentro del grafo.- 3) No es posible ingresar una arista ya existente (miso origen y mismo destino, aunque el costo sea diferente).- 4) El costo debe ser mayor que 0.
     *
     * @param arista
     * @return True si se pudo insertar la adyacencia, false en caso contrario
     */
    @Override
    public boolean insertarArista(TArista arista) {
        boolean tempbool = false;
        if ((arista.getEtiquetaOrigen() != null) && (arista.getEtiquetaDestino() != null)) {
            TVertice vertOrigen = buscarVertice(arista.getEtiquetaOrigen());
            TVertice vertDestino = buscarVertice(arista.getEtiquetaDestino());
            tempbool = (vertOrigen != null) && (vertDestino != null);
            if (tempbool) {
                //getLasAristas().add(arista);
                return vertOrigen.insertarAdyacencia(arista.getCosto(), vertDestino);
            }

        }
        return false;
    }

    /**
     * Metodo encargado de insertar un vertice en el grafo.
     *
     * No pueden ingresarse v�rtices con la misma etiqueta. La etiqueta especificada como par�metro debe ser v�lida.
     *
     * @param unaEtiqueta Etiqueta del v�rtice a ingresar.
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

    @Override
    public void desvisitarVertices() {
        for (TVertice vertice : this.vertices.values()) {
            vertice.setVisitado(false);
        }
    }

    /**
     * @return the vertices
     */
    @Override
    public Map<Comparable, TVertice> getVertices() {
        return vertices;
    }

    @Override
    public Collection<TVertice> bpf(TVertice vertice) {
        this.desvisitarVertices();
        LinkedList<TVertice> listaBusqueda = new LinkedList<TVertice>();
        if (vertice != null) {
            vertice.bpf(listaBusqueda);
        } else {
            System.out.println("No existe el vertice indicado.");
        }
        return listaBusqueda;
    }

    @Override
    public Collection<TVertice> bpf() {
        this.desvisitarVertices();
        LinkedList<TVertice> listaBusqueda = new LinkedList<TVertice>();
        Collection<TVertice> vertices = this.vertices.values();
        for (TVertice vertice : vertices) {
            if (!vertice.getVisitado()) {
                vertice.bpf(listaBusqueda);
            }
        }
        return listaBusqueda;
    }

    @Override
    public Collection<TVertice> bpf(Comparable etiquetaOrigen) {
        this.desvisitarVertices();
        TVertice verticeOrigen = this.buscarVertice(etiquetaOrigen);
        LinkedList<TVertice> listaBusqueda = new LinkedList<TVertice>();
        if (verticeOrigen != null) {
            verticeOrigen.bpf(listaBusqueda);
        } else {
            System.out.println("No existe vertice con la etiqueta indicada.");
        }

        return listaBusqueda;
    }

    @Override
    public Comparable centroDelGrafo() {
        Set<Comparable> etiquetas = vertices.keySet();

        Double min = Double.MAX_VALUE;
        Comparable etiquetaMin = etiquetas.iterator().next();
        for (Comparable etiqueta : etiquetas) {
            Double excentricidad = (Double) obtenerExcentricidad(etiqueta);
            if (excentricidad < min && excentricidad != -1) {
                min = excentricidad;
                etiquetaMin = etiqueta;
            }
        }
        return etiquetaMin;
    }

    @Override
    public Double[][] floyd() {
        Double[][] A = UtilGrafos.obtenerMatrizCostos(this.vertices);
        int n = A.length;
        int i, j, k;
        for (k = 0; k < n; k++) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if ((A[i][k] + A[k][j]) < A[i][j]) {
                        A[i][j] = A[i][k] + A[k][j];
                    }
                }
            }
        }
        return A;
    }

    @Override
    public Comparable obtenerExcentricidad(Comparable etiquetaVertice) {
        Double[][] floyd = this.floyd();
        Set<Comparable> etiquetas = vertices.keySet();

        int pos = 0;
        for (Comparable etiqueta : etiquetas) {
            if (etiqueta.equals(etiquetaVertice)) {
                break;
            }
            pos += 1;
        }
        Double max = 0.0;
        for (int i = 0; i < etiquetas.size(); i++) {
            if (floyd[i][pos] > max) {
                max = floyd[i][pos];
            }
        }
        return (max == Double.MAX_VALUE ? -1 : max);
    }

    @Override
    public boolean[][] warshall() {
        Double[][] matrizCostos = UtilGrafos.obtenerMatrizCostos(getVertices());
        boolean[][] matrizWarshall = new boolean[matrizCostos.length][matrizCostos.length];
        for (int i = 0; i < matrizCostos.length; i++) {
            for (int j = 0; j < matrizCostos.length; j++) {
                matrizWarshall[i][j] = false;

                if (i != j && matrizCostos[i][j] != Integer.MAX_VALUE) {
                    matrizWarshall[i][j] = true;
                }
            }
        }
        for (int k = 0; k < matrizWarshall.length; k++) {
            for (int i = 0; i < matrizWarshall.length; i++) {
                for (int j = 0; j < matrizWarshall.length; j++) {
                    if ((i != k) && (k != j) && (i != j)) {
                        if (!matrizWarshall[i][j]) {
                            matrizWarshall[i][j] = matrizWarshall[i][k] && matrizWarshall[k][j];
                        }
                    }
                }
            }
        }
        return matrizWarshall;
    }

    @Override
    public TCaminos todosLosCaminos(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        desvisitarVertices();
        TCaminos todosLosCaminos = new TCaminos();
        TVertice v = buscarVertice(etiquetaOrigen);
        if (v != null) {
            TCamino caminoPrevio = new TCamino(v);
            v.todosLosCaminos(etiquetaDestino, caminoPrevio, todosLosCaminos);
            return todosLosCaminos;
        }
        return null;
    }

    @Override
    public boolean tieneCiclo(TCamino camino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tieneCiclo(Comparable etiquetaOrigen) {
        this.desvisitarVertices();
        TVertice vertice = this.buscarVertice(etiquetaOrigen);
        if (vertice != null) {
            LinkedList<Comparable> camino = new LinkedList<>();
            if (vertice.tieneCiclo(camino)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean tieneCiclo() {
        this.desvisitarVertices();
        for (TVertice vertice : vertices.values()) {
            LinkedList<Comparable> camino = new LinkedList<>();
            if (!vertice.getVisitado()) {
                if (vertice.tieneCiclo(camino)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Collection<TVertice> bea() {
        desvisitarVertices();
        LinkedList<TVertice> listaVisitados = new LinkedList<>();
        for (TVertice vertice : this.vertices.values()) {
            vertice.bea(listaVisitados);
        }
        return listaVisitados;
    }

    public boolean existeCamino(Comparable origen, Comparable destino) {
        Set<Comparable> etiquetas = vertices.keySet();

        if (etiquetas.contains(origen) && etiquetas.contains(destino)) {
            boolean[][] warshall = this.warshall();
            int posOrigen = 0;
            int posDestino = 0;
            for (Comparable etiqueta : etiquetas) {
                if (etiqueta.equals(origen)) {
                    break;
                }
                posOrigen += 1;
            }
            for (Comparable etiqueta : etiquetas) {
                if (etiqueta.equals(destino)) {
                    break;
                }
                posDestino += 1;
            }

            if (warshall[posOrigen][posDestino] != false) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean conectados(TVertice u, TVertice v) {
        this.desvisitarVertices();
        if (this.existeVertice(u.getEtiqueta()) && this.existeVertice(v.getEtiqueta())) {
            return this.buscarVertice(u.getEtiqueta()).conectadoCon(v);
        }
        return false;
    }

    public void caminoCritico(Comparable etiquetaOrigen, Comparable etiquetaDestino) {
        if (!tieneCiclo()) {
            TCaminos todosLosCaminos = this.todosLosCaminos(etiquetaOrigen, etiquetaDestino);
            Collection<TCamino> caminos = todosLosCaminos.getCaminos();
            TCamino caminoCritico = todosLosCaminos.getCaminoMayorCosto();

            System.out.println("Camino Critico:");
            System.out.println(caminoCritico.imprimirEtiquetas());
            caminos.remove(caminoCritico);

            System.out.println("\nOtros Caminos:");
            for (TCamino elemen : caminos) {
                System.out.print(elemen.imprimirEtiquetas());
                System.out.println(" - Holgura: " + (caminoCritico.getCostoTotal() - elemen.getCostoTotal()));
            }
        } else {
            System.out.println("Tiene ciclos");
        }
    }

    public LinkedList<TVertice> unOrdenTopologico(TVertice w) {
        this.desvisitarVertices();
        if (this.existeVertice(w.getEtiqueta()) && !this.tieneCiclo()) {
            TGrafoDirigido nuevoGrafo = this.getGrafoInvertido();
            LinkedList<TVertice> ordenTopologico = new LinkedList<TVertice>();
            nuevoGrafo.getVertices().get(w.getEtiqueta()).ordenTopologico(ordenTopologico);
            return ordenTopologico;
        } else {
            System.out.println("Tiene ciclos, orden topológico no disponible");
            return null;
        }
    }

    private TGrafoDirigido getGrafoInvertido() {
        LinkedList<TArista> aristas = new LinkedList<TArista>();
        LinkedList<TVertice> vertices = new LinkedList<TVertice>();
        Collection<TVertice> verticesGrafo = this.getVertices().values();
        for (TVertice vertice : verticesGrafo) {
            LinkedList<TAdyacencia> adyacentes = vertice.getAdyacentes();
            vertices.add(new TVertice<>(vertice.getEtiqueta()));
            for (TAdyacencia adyacencia : adyacentes) {
                aristas.add(new TArista(adyacencia.getDestino().getEtiqueta(), vertice.getEtiqueta(), adyacencia.getCosto()));
            }

        }
        return new TGrafoDirigido(vertices, aristas);
    }
}
