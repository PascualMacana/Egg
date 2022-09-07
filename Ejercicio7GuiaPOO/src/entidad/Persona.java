package entidad;

import java.util.Scanner;

public class Persona {
   
    Scanner ingresar = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    //Comprombamos si el sexo es valido
    public void setSexo(String sexo) {
        this.sexo = sexo;
        if (!(this.getSexo().equalsIgnoreCase("H") || this.getSexo().equalsIgnoreCase("M") || this.getSexo().equalsIgnoreCase("O"))){
            System.out.println("Error, ingreso una letra erronea");
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){
        
        System.out.println("Ingrese el nombre");
        setNombre(ingresar.nextLine());
        System.out.println("ingrese la edad");
        setEdad(ingresar.nextInt());
        System.out.println("Ingrese el sexo");
        setSexo(ingresar.next());
        System.out.println("ingrese el peso");
        setPeso(ingresar.nextFloat());
        System.out.println("Ingrese la altura");
        setAltura(ingresar.nextFloat()); 
        
    }
    
    public void calcularIMC(){
        System.out.println("Este metodo va a calcular su IMC");
        float imc = (float) (peso / Math.pow(altura, 2));
        System.out.println(imc);
        if (imc < 20){
            System.out.println("Estas por debajo de tu peso");
            System.out.println("-1");
        }
        
        if (imc >= 20 && imc <= 25){
            System.out.println("Estas en tu peso ideal");
            System.out.println("0");
        } 
        if (imc > 25){
            System.out.println("Estas por encima de tu  peso ideal");
            System.out.println("1");
        }  
    }
    
    public boolean esMayorDeEdad(){
        boolean mayorMenor;
        
        if (edad <= 18){
            mayorMenor = false;
        }else {
            mayorMenor = true;
        }
        System.out.println(mayorMenor);
        return mayorMenor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}   

