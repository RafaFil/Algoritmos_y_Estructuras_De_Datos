
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ocamp
 */
public class TGrafoRedElectrica extends TGrafoNoDirigido implements IGrafoRedElectrica{
    
    public TGrafoRedElectrica(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public TAristas mejorRedElectrica() {
        if (this.getVertices().isEmpty()) {
            return null;
        }

        Map<Comparable, TVertice> V = new HashMap<>(this.getVertices());
        Map<Comparable, TVertice> U = new HashMap();
        TAristas aristasAAM = new TAristas();
        TArista tempArista = null;
        Double costoPrim = 0.0;
        TVertice tempV;
        tempV = (TVertice) V.values().toArray()[0];
        U.put(tempV.getEtiqueta(), tempV);

        while (!V.isEmpty()) {
            tempArista = this.lasAristas.buscarMin(U.keySet(), V.keySet());
            aristasAAM.add(tempArista);
            U.put(tempArista.getEtiquetaDestino(), V.remove(tempArista.getEtiquetaDestino()));
            costoPrim += tempArista.getCosto();
        }
        //System.out.println("Costo : " + costoPrim);
        return aristasAAM;
    }

}