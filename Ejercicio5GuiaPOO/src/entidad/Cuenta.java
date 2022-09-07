package entidad;

public class Cuenta {
    
    private int DNI;
    private int saldo;
    private int numeroCuenta;
    
    //Constructores

    public Cuenta(int DNI, int saldo, int numeroCuenta) {
        this.DNI = DNI;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta() {
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "DNI=" + DNI + ", saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + '}';
    }
    
    
         
}
