package servicio;

import entidad.NIF;
import java.util.Scanner;

public class NIFServicio {
   
    Scanner leer = new Scanner(System.in);
    NIF ni1 = new NIF();
    
    String cadenaNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
    char vectorA[] = new char[cadenaNIF.length()];
    
    public NIF crearNif(){
        System.out.println("Ingrese su DNI: ");
        ni1.setDni(leer.nextInt());
        
        int restoDNI = ni1.getDni() % 23;
        System.out.println(restoDNI);
        
        //Para asignarle un letra a cada espacio del vectorA.
        for (int i = 0; i < cadenaNIF.length(); i++) {
            vectorA[i] = cadenaNIF.charAt(i);
        }
        
        //Extraigo el resto de la division y cuando es igual a la posicion se imprime la letra.
        for (int i = 0; i < cadenaNIF.length(); i++) {
            if (restoDNI == i){
                System.out.println(vectorA[i]);
                ni1.setLetra(vectorA[i]);
                
            }
        }
        return ni1;
    }
    
    public NIF mostrar(NIF ni1){
        
        System.out.println("Su NIF: " + ni1.getDni() + "-" + ni1.getLetra());
        return ni1;
        
    }
}
