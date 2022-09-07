package ejercicio2guiapoo;

import entidad.Circunferencia;
import servicio.CircunferenciaServicio;

public class Ejercicio2GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        
        Circunferencia c1 = cs.crearCircunferencia(); //Llamo al metodo
        
        c1 = cs.area(c1); //Llamo al metodo
        
        c1 = cs.perimetro(c1); //Llamo al metodo
        
        System.out.println(c1.toString()); 
    }
    
}
