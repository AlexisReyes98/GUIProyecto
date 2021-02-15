
package Model;

/**
 *
 * @author giova
 */
public class Principal {
    
    private boolean alarma;
    
    public Principal(boolean alarma) {
        this.alarma = alarma;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    @Override
    public String toString() {
        alarma = true;
        return "Estado de alarma alarma = "+alarma;
    }
    
}
