import java.util.LinkedList;


public class TArbolTrieTelefonos implements IArbolTrieTelefonos {

    private TNodoTrieTelefonos raiz;
    
    public TArbolTrieTelefonos(){
        raiz = null;
    }

    @Override
    public LinkedList<TAbonado> buscarTelefonos(String pais, String area) {
        
        if (this.raiz == null) {
            return null;
        } else {
            LinkedList<TAbonado> abonados = new LinkedList<>();
            raiz.buscarTelefonos(pais+area, abonados);
            return abonados;
        }
    }

    @Override
    public void insertar(TAbonado unAbonado) {
        if (raiz == null) {
            raiz = new TNodoTrieTelefonos();
        }
        raiz.insertar(unAbonado);
        
    } 
    
}
