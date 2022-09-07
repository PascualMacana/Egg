
package servicio;

import entidad.Raices;
import java.util.Scanner;


public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    Raices rai1 = new Raices();
    double discriminante;
    //boolean tieneRaizes = discriminante >= 0;
    
    public Raices crearUna(){
        System.out.println("Ingrese un numero A para una ecuacion de 2do grado");
        rai1.setA(leer.nextDouble());
        
        System.out.println("Ingrese un numero B para una ecuacion de 2do grado");
        rai1.setB(leer.nextDouble());
        
        System.out.println("Ingrese un numero C para una ecuacion de 2do grado");
        rai1.setC(leer.nextDouble());
        return rai1;
    }
    
    public Raices getDescriminante(Raices rai1){
        discriminante = (Math.pow(rai1.getB(), 2)) - 4 * rai1.getA() * rai1.getC();
        
        System.out.println("El discriminante es: " + discriminante);
        return rai1;
    }
    
    public boolean tieneRaices(Raices rai1){
        boolean tieneRaizes = (discriminante > 0);
        
        if (tieneRaizes){
            System.out.println(tieneRaizes);
        }else{
            tieneRaizes = false;
            System.out.println(tieneRaizes);
        }
        return tieneRaizes;
    }
    
    public boolean tieneRaiz(Raices rai1){
        boolean decifrandoLaRaiz = true; //discriminante = 0
        
        if (discriminante == 0){
            System.out.println(decifrandoLaRaiz);
        }else{
            decifrandoLaRaiz = false;
            System.out.println(decifrandoLaRaiz);
        }
        return decifrandoLaRaiz;
    }
    
    public Raices obtenerRaices(Raices rai1){
        double primerSol = (-(rai1.getB()) + Math.sqrt((Math.pow(rai1.getB(), 2)- 4 * rai1.getA() * rai1.getC())))/2 * rai1.getA();
        double segundaSol = (-(rai1.getB()) - Math.sqrt((Math.pow(rai1.getB(), 2)- 4 * rai1.getA() * rai1.getC())))/2 * rai1.getA();
        
        if (tieneRaices(rai1)){
            System.out.println("Las dos soluciones:");
            System.out.println("Solucion uno: " + primerSol);
            System.out.println("Solucion dos: " + segundaSol);
        }
        return rai1;
    }
    
    public Raices obtenerRaiz(Raices rai1){
        double unicaSol = (-(rai1.getB()) + Math.sqrt((Math.pow(rai1.getB(), 2)- 4 * rai1.getA() * rai1.getC())))/2 * rai1.getA();
        
        if (tieneRaiz(rai1)){
            System.out.println("La unica solucion");
            System.out.println(unicaSol);
        }
        return rai1;
    }
    
    
     
}
