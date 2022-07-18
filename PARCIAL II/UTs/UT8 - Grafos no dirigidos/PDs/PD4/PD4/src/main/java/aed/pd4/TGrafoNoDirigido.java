package aed.pd4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido {

    protected TAristas lasAristas = new TAristas();

    /**
     *
     * @param vertices
     * @param aristas
     */
    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
        lasAristas.insertarAmbosSentidos(aristas);

    }

    @Override
    public boolean insertarArista(TArista arista) {
        boolean tempbool = false;
        TArista arInv = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
        tempbool = (super.insertarArista(arista) && super.insertarArista(arInv));
        return tempbool;
    }

    public TAristas getLasAristas() {
        return lasAristas;
    }

    @Override
    public TGrafoNoDirigido Prim() {
        if (this.getVertices().isEmpty()) {
            return null;
        }

        Map<Comparable, TVertice> V = new HashMap<>(this.getVertices());
        Map<Comparable, TVertice> U = new HashMap();
        TAristas aristasAAM = new TAristas();
        TArista tempArista = null;
        Double costoPrim = 0.0;
        // Agregar el primer TVertice a U
        TVertice tempV;
        tempV = (TVertice) V.values().toArray()[0];
        U.put(tempV.getEtiqueta(), tempV);

        while (!V.isEmpty()) {
            tempArista = this.lasAristas.buscarMin(U.keySet(), V.keySet());
            aristasAAM.add(tempArista);
            U.put(tempArista.getEtiquetaDestino(), V.remove(tempArista.getEtiquetaDestino()));
            costoPrim += tempArista.getCosto();
        }
        System.out.println("Costo PRIM: " + costoPrim);
        return new TGrafoNoDirigido(U.values(), aristasAAM); // AAM

    }

    @Override
    public TGrafoNoDirigido Kruskal() {

        TGrafoNoDirigido AAM = new TGrafoNoDirigido(getVertices().values(), new TAristas());
        Map<Comparable, TVertice> verticesAAM = AAM.getVertices();
        TAristas aristasAAM = AAM.lasAristas;

        Collection<Comparable> clavesVertices = verticesAAM.keySet();
        TAristas copiaAristas = new TAristas();
        copiaAristas.addAll(lasAristas);

        while ((aristasAAM.size() / 2) < verticesAAM.size() - 1) {
            TArista aristaMenor = copiaAristas.buscarMin(clavesVertices, clavesVertices);
            copiaAristas.remove(aristaMenor);
            copiaAristas.remove(aristaMenor.aristaInversa());
            TVertice origen = verticesAAM.get(aristaMenor.etiquetaOrigen);
            TVertice destino = verticesAAM.get(aristaMenor.etiquetaDestino);
            if (!origen.conectadoCon(destino) && !destino.conectadoCon(origen)) {
                AAM.insertarArista(aristaMenor);
                aristasAAM.insertarAmbosSentidos(aristaMenor);
            }
            AAM.desvisitarVertices();
        }

        return AAM;

    }

    @Override
    public Collection<TVertice> bea(Comparable etiquetaOrigen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<TVertice> puntosArticulacion(Comparable etOrigen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esConexo() {
        if (this.getVertices().size() <= 0) {
            return false;
        }

        Set<TVertice> todosLosVertices = new HashSet<>(this.getVertices().values());
        TVertice vertOrigen = todosLosVertices.iterator().next();
        Collection<TVertice> verticesEnBPF = this.bpf(vertOrigen);

        for (TVertice vertice : verticesEnBPF) {
            todosLosVertices.remove(vertice);
        }

        return todosLosVertices.isEmpty();
    }
    // ---------------- EJERCICIO 2 -----------------------------
    
    public boolean conectadoCon(TVertice origen, TVertice destino){
        return origen.conectadoCon(destino);
    }
}
