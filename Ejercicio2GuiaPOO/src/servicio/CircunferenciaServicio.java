package servicio;

import entidad.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    Scanner ingresar = new Scanner(System.in);
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia");
        
        Circunferencia c1 = new Circunferencia(ingresar.nextFloat());
        // o c1.setRadio(ingresar.nextFloat()); ambos codigos funcionan.
        
        return c1;
        
        
    }
    
    public Circunferencia area(Circunferencia c1){
        System.out.println("Ingrese el area de la circunferencia");
        float area = ingresar.nextFloat();
        //Math.pow sirve para conseguir la potencia de un numero, utilizo el get para conseguir el valor del radio, el problema me pide que no este como atributo
        float total = area * (float) Math.pow(c1.getRadio(), 2);
        System.out.println("El area es " + total);
        
        return c1;
        
    }
    
    public Circunferencia perimetro(Circunferencia c1){
        System.out.println("Ingrese el perimetro");
        float perimetro = ingresar.nextFloat();
        float totalp = 2 * (float) Math.PI * c1.getRadio();
        System.out.println("El perimetro es " + totalp);
        
        return c1;
    }
}
