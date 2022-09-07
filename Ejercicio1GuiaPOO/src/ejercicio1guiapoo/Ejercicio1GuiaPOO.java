package ejercicio1guiapoo;

import Entidad.Libro;
import Servicios.LibroServicio;


public class Ejercicio1GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos el objeto de servicio
        LibroServicio ls = new LibroServicio();
        //tiene que coincidir l1 con lo que devuelve el servicio.
        Libro l1 = ls.infoLibro();
        
        //metodo toString para mostrar la informacion cargada por el usuario.
        System.out.println(l1.toString());
    }
    
}
