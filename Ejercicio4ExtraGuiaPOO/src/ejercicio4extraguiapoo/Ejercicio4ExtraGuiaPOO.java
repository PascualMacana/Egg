package ejercicio4extraguiapoo;

import entidad.NIF;
import servicio.NIFServicio;

public class Ejercicio4ExtraGuiaPOO {

    
    public static void main(String[] args) {
        
        NIFServicio ns = new NIFServicio();
        NIF ni1 = ns.crearNif();
        ns.mostrar(ni1);
    }
    
}
