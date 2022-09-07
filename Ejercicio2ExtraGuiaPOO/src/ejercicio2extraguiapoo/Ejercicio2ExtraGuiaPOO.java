package ejercicio2extraguiapoo;

import entidad.Puntos;
import servicio.PuntosServicio;

public class Ejercicio2ExtraGuiaPOO {

    
    public static void main(String[] args) {
        
        PuntosServicio ps = new PuntosServicio();
        Puntos pun1 = ps.crearPuntos();
        ps.calcularDistancia(pun1);
        
    }
   
}
