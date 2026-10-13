package banco;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public SaldoInsuficienteException(String message){
        super(message);
    }
}
