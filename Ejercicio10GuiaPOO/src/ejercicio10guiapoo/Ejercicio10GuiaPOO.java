package ejercicio10guiapoo;

import java.util.Arrays;

public class Ejercicio10GuiaPOO {

    
    public static void main(String[] args) {
        float vectorA[] = new float[50];
        float vectorB[] = new float[20];
        
        for (int i = 0; i < 50; i++) {
            vectorA[i] = (float) (Math.random() * 10);
            System.out.print(vectorA[i] + " ");
        }System.out.println();
        
        System.out.println("Arreglo ordenado de menor a mayor");
        
        Arrays.sort(vectorA);
        for (int i = 0; i < 50; i++) {
            System.out.print(vectorA[i] + " ");
        }System.out.println();
        
        System.out.println("******************************************************************");
        
        System.out.println("Se copiaran los primeros 10 valores del vectorA a las 10 posiciones del vector B");
        //Arrays.fill(vector que quiero llenar, posiones de inicio, posicione del final, variable con qie lo quiero llenar
        //en este caso como son distintos valores tengo que hacer un bucle para que el vectorA vaya cambiando de valor.
        
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i]; 
            System.out.print(vectorB[i] + " ");
        }System.out.println();
        
        System.out.println("******************************************************************"); 
        
        System.out.println("Se le asignara el valor de 0.5 a los ultimas 10 posiciones del vector B");
        
        Arrays.fill(vectorB,10, 20, (float) 0.5);
        
        for (int i = 0; i < 20; i++) {
            System.out.print( vectorB[i] + " ");
        }System.out.println();
        
        
    }
    
    
}
