
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestCases {

    public TestCases() {}
    
    @Test
    public void testcantYvalorStock() {
        TArbolPiezas arbolPrueba = new TArbolPiezas();
        Pieza pieza1 = new Pieza("10", "1.1.1", "una pieza", 1, 1);
        int[] expected = {1,1};
        assertEquals(expected , arbolPrueba.cantYvalorStock());
    }
    
    //@Test
    public void testPiezaPorRubro() {
        TArbolPiezas arbolPrueba2 = new TArbolPiezas();
        Pieza piezaA = new Pieza("10", "1.1.1", "una pieza", 1, 1);
        Pieza piezaB = new Pieza("200", "2.2.2", "una pieza", 2, 2);
        
        arbolPrueba2.insertar(new TElementoAB<Pieza>(piezaA.getCodigoCatalogo(),piezaA));
        arbolPrueba2.insertar(new TElementoAB<Pieza>(piezaB.getCodigoCatalogo(),piezaB));
        
        TArbolPiezas nuevo = arbolPrueba2.piezasPorRubro("1");
        
        int expectedSize = 1;
        assertEquals(expectedSize,nuevo.inOrden().size());
    }
    
    @Test public void testPiezasPorRubroNinguna(){
        TArbolPiezas arbolPrueba2 = new TArbolPiezas();
        Pieza piezaA = new Pieza("10", "1.1.1", "una pieza", 1, 1);
        Pieza piezaB = new Pieza("200", "2.2.2", "una pieza", 2, 2);
        
        arbolPrueba2.insertar(new TElementoAB<Pieza>(piezaA.getCodigoCatalogo(),piezaA));
        arbolPrueba2.insertar(new TElementoAB<Pieza>(piezaB.getCodigoCatalogo(),piezaB));
        
        TArbolPiezas nuevo = arbolPrueba2.piezasPorRubro("8");
        
        int expectedSize = 0;
        assertEquals(expectedSize,nuevo.inOrden().size());
    }
    
    @Test
    public void testInsertarUneElemento(){
        TArbolPiezas arbolPrueba2 = new TArbolPiezas();
        Pieza piezaA = new Pieza("10", "1.1.1", "una pieza", 1, 1);
        Pieza piezaB = new Pieza("200", "1.1.1", "una pieza", 2, 2);
        
        arbolPrueba2.insertar(new TElementoAB<Pieza>(piezaA.getCodigoPieza(),piezaA));
        arbolPrueba2.insertar(new TElementoAB<Pieza>(piezaB.getCodigoPieza(),piezaB));
        
        int expectedSize = 2;
        assertEquals(expectedSize,arbolPrueba2.inOrden().size());
        
    }   
    
    
    
    
}
