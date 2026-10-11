package syncroThread;

public class ContaBancaria {

    private final Object monitor = new Object();

    private double saldo = 1000;

    public void sacar(double valor){
       synchronized (monitor){
           saldo -= valor;
       }

    }

    public void depositar(double valor){
        synchronized (monitor){
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
