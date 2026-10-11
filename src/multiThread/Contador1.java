package multiThread;

public class Contador1 {

    private int valor;

    public synchronized void increment(){
        valor++;
    }

    public int getValor(){
        return valor;
    }
}
