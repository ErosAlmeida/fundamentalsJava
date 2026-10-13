package banco;

public abstract class Conta {
    private double saldo;

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
