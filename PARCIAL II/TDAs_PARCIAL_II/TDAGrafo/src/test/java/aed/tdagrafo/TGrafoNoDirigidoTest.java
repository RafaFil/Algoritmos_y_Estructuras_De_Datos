/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aed.tdagrafo;

import java.util.Collection;
import java.util.LinkedList;
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
public class TGrafoNoDirigidoTest {

    public TGrafoNoDirigidoTest() {
    }

    @Test
    public void testBea() {
        Collection<TVertice> vertices = new LinkedList<>();
        Collection<TArista> aristas = new LinkedList<>();
        TVertice a = new TVertice("a");
        TVertice b = new TVertice("b");
        TVertice c = new TVertice("c");

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(new TVertice("d"));

        TArista ab = new TArista("a", "b", 10);
        TArista bc = new TArista("b", "c", 15);
        TArista ca = new TArista("c", "a", 5);
        TArista bd = new TArista("b", "d" , 20);
        TArista dc = new TArista("d", "c", 10);
        
        aristas.add(ab);
        aristas.add(bc);
        aristas.add(ca);
        aristas.add(bd);
        aristas.add(dc);

        TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);

        String[] expectedRecorrido = {"a", "b", "c","d"};

        LinkedList<TVertice> verticesB = (LinkedList<TVertice>) grafo.bea("a");
        
        String[] restEtiquetas = new String[verticesB.size()];
        for (int i = 0; i < verticesB.size(); i++) {
            restEtiquetas[i] = (String) verticesB.get(i).getEtiqueta();
        }
        System.out.println(restEtiquetas.length);
        System.out.println(expectedRecorrido.length);
        assertArrayEquals(expectedRecorrido, restEtiquetas);
    }
    
    @Test
    public void testPuntosArt(){
        assertEquals(true, true);
    }

}
