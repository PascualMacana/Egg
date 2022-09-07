package servicio;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhoracoServicio {
    Scanner leer = new Scanner(System.in);
    Ahorcado hang = new Ahorcado();
    String palabra;
    int contadorEncontrada = 0;
    int contadorNoEncontradas = 0;
    int letrasRestantes;
    
    public Ahorcado crearJuego(){
        
        System.out.println("Ingrese la palabra a adivinar");
        palabra = leer.next();
        //vector para convertir la palabra a posicion del vector sino no puedo convertir char a char[].
        char[] vector1 = new char[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            char letraxletra = palabra.charAt(i);
            vector1[i] = letraxletra;
            hang.setPalabraBuscar(vector1);
        }
        
        System.out.println("Ingrese la cantidad de jugadas maximas que puede hacer");
        hang.setJugadasMax(leer.nextInt());
        
        return hang;
    }
    
    public Ahorcado longitud(Ahorcado hang){
        System.out.println("La palabra a encontrar tiene " + hang.getPalabraBuscar().length + " caracteres");
        return hang;
    }
    
    public Ahorcado buscar(Ahorcado hang, char letra){
        
        //bucle para que vea letra por letra si esta en la palabra.
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == hang.getPalabraBuscar()[i]){
                contadorEncontrada++;//Al encontrar la letra se suma uno en esta variable y se setea en el objeto, por lo tanto va a ir variando siempre sin necesidad de resetear.
                hang.setLetrasEncontradas(contadorEncontrada);
            }else{
                contadorNoEncontradas++;
            }
        }
        if (hang.getLetrasEncontradas() != 0){
            System.out.println("La letra esta en la palabra");
        }
        if (contadorNoEncontradas == palabra.length()){ //Si no esta la letra le suma la cantidad de unidades que tiene la palabra de largo y luego imprime que no esta, despues seteamos el valor a 0 para que comienze de nuevo.
            System.out.println("La letra no se encontro en la palabra");
            contadorNoEncontradas = 0;
        }
       return hang;
    }
    
    public boolean encontradas(Ahorcado hang, char letra){
        //el booleano es para saber si es true o no, en caso de que sea false se le resta una oportunidad.
        boolean estaONo = hang.getLetrasEncontradas() > 0;
        
        
        letrasRestantes = palabra.length() - contadorEncontrada;
        
        if (estaONo){
            System.out.println("Letras encontradas: " + hang.getLetrasEncontradas());
            System.out.println("Letras faltantes: " + letrasRestantes);
            if (letrasRestantes == 0 ){ //Si adivina todas gana el juego
                hang.setJugadasMax(0);
            }
             
        }else {
            System.out.println("Letras encontradas: " + hang.getLetrasEncontradas());
            System.out.println("Letras faltantes: " + letrasRestantes);
            hang.setJugadasMax(hang.getJugadasMax() - 1);
        }
        return estaONo;
    }
    
    public Ahorcado intentos(Ahorcado hang){
        
        if (hang.getJugadasMax() == 0 && letrasRestantes != 0){
            System.out.println("Lo siento ya no tiene mas intentos");
        }else if (letrasRestantes == 0){
            System.out.println("Felicitaciones gano");
        }else {
            System.out.println("Le quedan " + hang.getJugadasMax() + " intentos mas");
        }
        
        return hang;
    }
    
    public Ahorcado juego(Ahorcado hang, char letra){
        
        longitud(hang);
        
        
        buscar(hang, letra);
        encontradas(hang, letra);
        intentos(hang);
        System.out.println("***************************************************");    
        
        
        return hang;
    }
    
}
