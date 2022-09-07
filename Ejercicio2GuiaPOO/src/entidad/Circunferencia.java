package entidad;

/**
 *
 * @author emiliano
 */
public class Circunferencia {
    
    //atributos
    private float radio;
    
    
    //constructor
    

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}
