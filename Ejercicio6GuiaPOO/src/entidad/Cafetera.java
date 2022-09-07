package entidad;

public class Cafetera {
    
    private int cantidadActual;
    private int capacidadMax;

    public Cafetera() {
    }

    public Cafetera(int cantidadActual, int capacidadMax) {
        this.cantidadActual = cantidadActual;
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    
    
}
