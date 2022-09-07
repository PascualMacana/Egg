package ejercicio3guiapoo;

import entidad.Operacion;
import servicio.OperacionServicio;

public class Ejercicio3GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        
        Operacion o1 = os.crearOperacion();
        
        //Llamamiento de metodos.
        o1 = os.sumar(o1);
        o1 = os.resta(o1);
        o1 = os.multiplicar(o1);
        o1 = os.dividir(o1);
        
        System.out.println(o1.toString());
    }
    
}
