
package Model;

/**
 *
 * @author giova
 */
public class Principal {
    
    private String alarma;

    public Principal() {
    }

    public Principal(String alarma) {
        this.alarma = alarma;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }
    
    @Override
    public String toString() {
        alarma = "Activada";
        return alarma;
    }
    
}
