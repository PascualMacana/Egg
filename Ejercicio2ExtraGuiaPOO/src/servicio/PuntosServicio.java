package servicio;

import entidad.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
    Puntos pun1 = new Puntos();
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese una coordenada para x1: ");
        pun1.setX1(leer.nextInt());
        
        System.out.println("Ingrese una coordenada para y1: ");
        pun1.setY1(leer.nextInt());
        
        System.out.println("Ingrese una coordenada para x2: ");
        pun1.setX2(leer.nextInt());
        
        System.out.println("Ingrese una coordenada para y2: ");
        pun1.setY2(leer.nextInt());
        
        return pun1;
    }
    
    public Puntos calcularDistancia(Puntos pun1){
        
        double resultado = Math.sqrt(Math.pow(pun1.getX2() - pun1.getX1(), 2) + Math.pow(pun1.getY2() - pun1.getY1(), 2));
        System.out.println("La distancia que hay entre los dos puntos es: " + resultado);
        return pun1;
        
    }
}
