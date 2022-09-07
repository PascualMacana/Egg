package entidad;

public class Ahorcado {
    
    private char[] palabraBuscar;
    private int letrasEncontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscar, int letrasEncontradas, int jugadasMax) {
        this.palabraBuscar = palabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public char[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(char[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    
}
