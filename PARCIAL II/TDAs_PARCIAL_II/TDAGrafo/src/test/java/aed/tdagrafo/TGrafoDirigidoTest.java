/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aed.tdagrafo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafael
 */
public class TGrafoDirigidoTest {

    public TGrafoDirigidoTest() {
    }

    @Test
    public void testTieneCiclo() {
        Collection<TVertice> vertices = new LinkedList<>();
        Collection<TArista> aristas = new LinkedList<>();
        TVertice a = new TVertice("a");
        TVertice b = new TVertice("b");
        TVertice c = new TVertice("c");

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);

        TArista ab = new TArista("a", "b", 10);
        TArista bc = new TArista("b", "c", 15);
        TArista ca = new TArista("c", "a", 5);
        aristas.add(ab);
        aristas.add(bc);
        aristas.add(ca);

        TGrafoDirigido grafo = new TGrafoDirigido(vertices, aristas);

        assertEquals(true, grafo.tieneCiclo());
    }

    @Test
    public void testBpf() {
        Collection<TVertice> vertices = new LinkedList<>();
        Collection<TArista> aristas = new LinkedList<>();
        TVertice a = new TVertice("a");
        TVertice b = new TVertice("b");
        TVertice c = new TVertice("c");

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);

        TArista ab = new TArista("a", "b", 10);
        TArista bc = new TArista("b", "c", 15);
        TArista ca = new TArista("c", "a", 5);
        aristas.add(ab);
        aristas.add(bc);
        aristas.add(ca);

        TGrafoDirigido grafo = new TGrafoDirigido(vertices, aristas);

        String[] expectedRecorrido = {"a", "b", "c"};

        LinkedList<TVertice> verticesB = (LinkedList<TVertice>) grafo.bpf("a");
        String[] restEtiquetas = new String[verticesB.size()];
        for (int i = 0; i < verticesB.size(); i++) {
            restEtiquetas[i] = (String) verticesB.get(i).getEtiqueta();
        }
        assertArrayEquals(expectedRecorrido, restEtiquetas);
    }

    @Test
    public void testTopologico() {
        Collection<TVertice> vertices = new LinkedList<>();
        Collection<TArista> aristas = new LinkedList<>();
        TVertice a = new TVertice("a");
        TVertice b = new TVertice("b");
        TVertice c = new TVertice("c");

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);

        TArista ab = new TArista("a", "b", 10);
        TArista ac = new TArista("a", "c", 15);
        aristas.add(ab);
        aristas.add(ac);

        TGrafoDirigido grafo = new TGrafoDirigido(vertices, aristas);
        System.out.println(grafo.getVertices().values().iterator().next().getEtiqueta());
        for (TVertice v : grafo.unOrdenTopologico(grafo.getVertices().values().iterator().next())) {
            
        }

    }

}
