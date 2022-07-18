package TDAlist;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }


    // implementar los metodos indicados en la interfaz

    @Override
    public void insertar(Nodo<T> nodo) {
        if (primero == null) {
            primero = nodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
        }     
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {   // condiciones de borde [FALTAN] - REVISAR
        Nodo <T> actual = primero;
        while (actual.getSiguiente() != null){
            if (actual.getDato()==clave){
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return new Nodo(null,null);
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (primero.getDato() == clave){
            primero = primero.getSiguiente();
            return true;
        }
        Nodo<T> actual = primero;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato() == clave){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
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
    public String imprimir(String separador) {
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
    public int cantElementos() {
        if (primero == null) {
            return 0;
        } else {
            int cant = 1;
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
                cant++;
            }
            return cant;
        }  
    }

    @Override
    public boolean esVacia() {
        return primero==null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        if (primero == null){
            this.primero = unNodo;
        }
        else{
            unNodo.setSiguiente(primero);
            this.primero = unNodo;
        }
    }
}
