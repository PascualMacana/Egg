package servicio;

import entidad.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    Scanner ingresar = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese los dos numeros que eligio");
        
        Operacion o1 = new Operacion(ingresar.nextInt(), ingresar.nextInt());
        return o1;
    }
    public Operacion sumar(Operacion o1){
        int suma = o1.getNumero1() + o1.getNumero2();
        System.out.println("La suma de ambos numeros es: " + suma);
        return o1;
    }
    
    public Operacion resta(Operacion o1){
        int resta = o1.getNumero1() - o1.getNumero2();
        System.out.println("La resta de ambos numeros es: " + resta);
        return o1;
    }
    
    public Operacion multiplicar(Operacion o1){
        int multi = o1.getNumero1() * o1.getNumero2();
        
        if (multi > 0){
            System.out.println("El resultado de la multiplicacion es: " + multi);
        }else {
            multi = 0;
            System.out.println(multi + " Error, se multiplica por 0");
        }
        return o1;
    }
    
    public Operacion dividir(Operacion o1){
        int division = o1.getNumero1() / o1.getNumero2();
        
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0){
            division = 0;
            System.out.println(division + " Error, se esta dividiendo por 0");
        }else{
            System.out.println("El resultado de la division es: " + division);
        }
        return o1;
    }
}
