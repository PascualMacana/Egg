package ejercicio6guiapoo;

import entidad.Cafetera;
import servicio.CafeteraServicio;


public class Ejercicio6GuiaPOO {

    
    public static void main(String[] args) {
        //Revisar el ejercicio entero, es medio raro como esta planteado.
        
        //Llamamiento de metodos:
        
        CafeteraServicio caSe = new CafeteraServicio();
        Cafetera ca1 = caSe.llenarCafetera();
        ca1 = caSe.servirTaza(ca1);
        ca1 = caSe.vaciarCafetera(ca1);
        ca1 = caSe.agregarCafe(ca1);
        
    }
    
}
