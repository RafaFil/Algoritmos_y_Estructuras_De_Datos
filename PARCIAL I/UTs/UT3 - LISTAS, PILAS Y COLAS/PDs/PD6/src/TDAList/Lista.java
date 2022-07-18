package TDAList;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }


    // implementar los metodos indicados en la interfaz

    @Override
    public void insertar(Nodo<T> nodo) { //OK
        if (primero == null) {
            this.primero = nodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }     
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {   
        if (this.esVacia()) {
            return null;
        } else {
            Nodo<T> actual = this.primero;
            while (actual != null) {
                if (actual.getEtiqueta().equals(clave)) {
                    return actual;
                }
                actual = actual.getSiguiente();
            }
        }
        return null;
        
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (!this.esVacia()) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = primero.getSiguiente();
                return true;
            }
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                if (actual.getSiguiente().getEtiqueta().equals(clave)) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                    return true;
                }
                actual = actual.getSiguiente();
            }
        }
        return false;
    }

    @Override
    public String imprimir() {  //OK
        if (primero == null) {
            return "nothing to print";
        } else {
            Nodo<T> actual = primero;
            String elementos = "";
            while (actual.getSiguiente() != null) {
                elementos = elementos + actual.getDato()+", ";
                actual = actual.getSiguiente();
            }
            elementos = elementos + actual.getDato();
            return elementos;
        }

    }

    @Override
    public String imprimir(String separador) { //OK
        if (primero == null) {
            return "nothing to print";
        } else {
            Nodo<T> actual = primero;
            String elementos = "";
            while (actual.getSiguiente() != null) {
                elementos = elementos + actual.getDato()+separador+" ";
                actual = actual.getSiguiente();
            }
            elementos = elementos + actual.getDato();
            return elementos;
        }
    }

    @Override
    public int cantElementos() { // OK
        if (primero == null) {
            return 0;
        } else {
            int cant = 1;
            Nodo<T> actual = primero.getSiguiente();
            while (actual != null) {
                actual = actual.getSiguiente();
                cant++;
            }
            return cant;
        }  
    }

    @Override
    public boolean esVacia() { // OK
        return primero==null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) { // OK
        if (primero == null){
            this.primero = unNodo;
        }
        else{
            unNodo.setSiguiente(primero);
            this.primero = unNodo;
        }
    }
}