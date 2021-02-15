
package Model;

/**
 *
 * @author giova
 */
public class Recomendaciones {
     private String recomendaciones;

    public Recomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    @Override
    public String toString() {
        return "Recomendaciones{" + "recomendaciones=" + recomendaciones + '}';
    }
    
}
