package servicio;

import entidad.Cuenta;
import java.util.Scanner;

public class CuentaServicio {
    Scanner ingresar = new Scanner(System.in);
    Cuenta c1 = new Cuenta();
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese su DNI");
        c1.setDNI(ingresar.nextInt());
        System.out.println("Ingrese su Numero de cuenta");
        c1.setNumeroCuenta(ingresar.nextInt());
        System.out.println("Ingrese su saldo");
        c1.setSaldo(ingresar.nextInt());
        
        return c1;
    }
    
    public Cuenta ingresar(Cuenta c1){
        System.out.println("Cuento dinero quiere ingresar?");
        double ingreso = ingresar.nextDouble();
        
        double total = ingreso + c1.getSaldo();
        System.out.println("El saldo actual de su cuenta es: " + total);
        
        //uso el set para cambiar el valor del saldo
        c1.setSaldo((int) total);
        return c1;
    }
    
    public Cuenta retiro(Cuenta c1){
        System.out.println("Ingrese la cantidad de plata que desea retirar");
        double extraccion = ingresar.nextDouble();
       
        if (extraccion >= c1.getSaldo()){
            System.out.println("Saldo actual: 0");
        }else {
            System.out.println("Saldo actual: " + (c1.getSaldo() - extraccion));
        }
        c1.setSaldo((int) (c1.getSaldo() - extraccion));
        
        return c1;
    }
    
    public Cuenta extraccionRapida(Cuenta c1){
        System.out.println("Este modo retira el 20% solamente");
        double sacar = (20 * c1.getSaldo()) / 100;
        
        if (sacar > c1.getSaldo()){
            System.out.println("No tiene dinero disponible");
        }else {
            System.out.println("Va a retirar " + sacar);
            System.out.println("El saldo restante es: " + (c1.getSaldo() - sacar) );
        }
        c1.setSaldo((int) (c1.getSaldo() - sacar));
        return c1;
    }
    
    public Cuenta consultarSaldo(Cuenta c1){
        System.out.println("Su saldo es: " + c1.getSaldo());
        return c1;
    }
    
//    public Cuenta consultarDatos(Cuenta c1){
//        System.out.println("Los datos de su cuenta: ");
//        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
//        System.out.println("Saldo: " + c1.getSaldo());
//        System.out.println("DNI: " + c1.getDNI());
//        return c1;
//    }
}
