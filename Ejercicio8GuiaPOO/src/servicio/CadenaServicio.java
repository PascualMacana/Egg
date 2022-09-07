
package servicio;

import entidad.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    Scanner ingresar = new Scanner(System.in);
    //Defino el objeto pero no uno nuevo porque ya le asigne valores en el main
    Cadena c1;
    
    int contadorVocales = 0;
    char a;
    
    //La clave es pasarle el valor de c1 como un parametro!!!!!!! a la hora de poner el charAt poner comillas simples.
    public Cadena mostrarVocales(Cadena c1){
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().charAt(i) == 'a' || c1.getFrase().charAt(i) == 'e' || c1.getFrase().charAt(i) == 'i'
                || c1.getFrase().charAt(i) == 'o' || c1.getFrase().charAt(i) == 'u'){
                contadorVocales++;
            }
        }
        
        System.out.println("La frase que ingreso tiene " + contadorVocales + " vocales");
        return c1;
    }
    
    public Cadena invertirFrase(Cadena c1){
        
        System.out.println("Este metodo va a darle vuela la frase");
        
        //El menos uno es importante porque la longitud empieza del 1 y no del 0.
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println();
        return c1;
    }
    
    public Cadena vecesRepetido(Cadena c1, String letra){
        int contador = 0;
        //El parametro que tengo que ingresar es un String, pero lo tengo que pasar a char para poder revisar letra por letra en el bucle
        char letra2 = letra.charAt(0);
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().charAt(i) == letra2){
                contador++;
            }
        }
        System.out.println("La " +letra + " se repite " + contador);
        return c1;
    }
    
    //Esta media bugueada la funcion me daba bien, de la nada empezo a andar mal
    public Cadena compararLongitud(Cadena c1, String segundaFrase){
        
        System.out.println(segundaFrase.compareTo(c1.getFrase()));
        
        return c1;
    }
    
    public Cadena unirFrases(Cadena c1, String unir){
        
        System.out.println(c1.getFrase().concat(unir));
        return c1;
        
    }
    
    public Cadena reemplazar(Cadena c1, String letraRemplazar){
        System.out.println(c1.frase.replace("a", letraRemplazar));
        return c1;
    }
    
    public Cadena contiene(Cadena c1, String letraEncontrar){
        System.out.println(c1.getFrase().contains(letraEncontrar));
        if (c1.getFrase().contains(letraEncontrar)){
            System.out.println("Encontro la letra buscada");
        }else{
            System.out.println("No encontro la letra");
        }
        return c1;
    }
}
