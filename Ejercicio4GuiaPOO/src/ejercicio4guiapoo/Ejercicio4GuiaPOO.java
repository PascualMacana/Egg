package ejercicio4guiapoo;

import entidad.Rectangulo;
import servicio.RectanguloServicio;

public class Ejercicio4GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        
        r1 = rs.superficie(r1);
        r1 = rs.perimetro(r1);
        r1 = rs.dibujo(r1);
        
    }
    
}
