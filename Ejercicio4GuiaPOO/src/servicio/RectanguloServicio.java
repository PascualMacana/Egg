package servicio;

import entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {
    Scanner ingresar = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo seguido de la altura");
        Rectangulo r1 = new Rectangulo(ingresar.nextInt(),ingresar.nextInt());
        return r1;
    }
    
    public Rectangulo superficie(Rectangulo r1){
        int superT = r1.getAltura() * r1.getBase();
        System.out.println("La superficie del rectangulo es: " + superT);
        return r1;
    }
    
    public Rectangulo perimetro(Rectangulo r1){
        int periT = (2 * r1.getBase()) + (2 * r1.getAltura());
        System.out.println("El perimetro del rectangulo es: " + periT);
        return r1;
    }
    
    public Rectangulo dibujo(Rectangulo r1){
        for (int i = 1; i <= r1.getAltura(); i++) {
            for (int j = 1; j <= r1.getBase(); j++) {
                if (i ==1 || i == r1.getAltura() || j == 1 || j == r1.getBase()){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return r1;
    }
}
