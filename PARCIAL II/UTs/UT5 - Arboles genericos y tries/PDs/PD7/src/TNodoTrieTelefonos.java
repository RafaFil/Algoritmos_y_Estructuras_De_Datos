
import java.util.LinkedList;

public class TNodoTrieTelefonos implements INodoTrieTelefonos {

    private static final int CANT_CHR_ABECEDARIO = 10;
    private TNodoTrieTelefonos[] hijos;
    private boolean esPalabra;
    public TAbonado usuario;

    public TNodoTrieTelefonos() {
        hijos = new TNodoTrieTelefonos[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }

    @Override
    public void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados) {
        TNodoTrieTelefonos nodoActual = this;
        for (int c = 0; c < primerosDigitos.length(); c++) {
            int indice = primerosDigitos.charAt(c) - '0';
            if (nodoActual.hijos[indice] == null) {
                return;
            }
            nodoActual = nodoActual.hijos[indice];
           
        }
        nodoActual.predecir(primerosDigitos, abonados);
    }

    private void predecir(String s, LinkedList<TAbonado> abonados) {
        if (this.usuario != null) {
            abonados.add(this.usuario);
        }
        for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
            if (this.hijos[c] != null) {
                this.predecir(s + (char) (c + '0'), abonados);
            }
        }
    }
    

    @Override
    public void insertar(TAbonado unAbonado) {
        TNodoTrieTelefonos nodo = this;
        for (int c = 0; c < unAbonado.getTelefono().length(); c++) {
            int indice = unAbonado.getTelefono().charAt(c) - '0';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrieTelefonos();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.usuario = unAbonado;
        nodo.esPalabra = true;
    }

}
