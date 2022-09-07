package ejercicio3extraguiapoo;

import entidad.Raices;
import servicio.RaicesServicio;


public class Ejercicio3ExtraGuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RaicesServicio raiser = new RaicesServicio();
        Raices rai1 = raiser.crearUna();
        raiser.getDescriminante(rai1);
        
        
        
        //Metodo calcular() jaja
        if(raiser.tieneRaices(rai1) == true){
            System.out.println("Su ecuacion tiene dos soluciones posibles");
            raiser.obtenerRaices(rai1);
        }
        if(raiser.tieneRaiz(rai1) == true){
            System.out.println("Su ecuacion tiene una solucion posible");
            raiser.obtenerRaiz(rai1);
        }
        
        
    }
    
}
