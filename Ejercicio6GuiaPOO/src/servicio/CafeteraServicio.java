package servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner ingresar = new Scanner(System.in);
    Cafetera ca1 = new Cafetera(250,600); //Valores dados por teclado
    
    public Cafetera llenarCafetera(){
        ca1.setCantidadActual(ca1.getCapacidadMax());
        return ca1;
    }
    
    public Cafetera servirTaza(Cafetera ca1){
        System.out.println("Introduzca el tamano de la taza en ml");
        int tamano = ingresar.nextInt();
        
        if (ca1.getCantidadActual() >= tamano){
            System.out.println("La taza se sirvio correctamente");
        }else {
            //el -1 lo puse para que el resultado no me de en negativo
            System.out.println("Le faltaron " + (-1*(ca1.getCantidadActual() - tamano)) + " ml para llenarse");
            ca1.setCantidadActual(ca1.getCantidadActual() - tamano);
        }
        return ca1;
    }
    
    public Cafetera vaciarCafetera(Cafetera ca1){
        ca1.setCantidadActual(0);
        return ca1;
    }
    
    public Cafetera agregarCafe(Cafetera ca1){
        System.out.println("Cuanto cafe desea poner?");
        int llenar = ingresar.nextInt();
        
        if (llenar > ca1.getCapacidadMax()){
            System.out.println("Lo siento la capacidad maxima que tiene la cafetera es de " + ca1.getCapacidadMax());
        }else {
            System.out.println("La cafetera se lleno correctamente");
            ca1.setCantidadActual(llenar);
        }
        return ca1;
    }
}
