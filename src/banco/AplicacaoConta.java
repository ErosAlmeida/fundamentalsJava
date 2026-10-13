package banco;

public class AplicacaoConta {
    static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.getSaldo(1000);
        try {
            c1.sacar(200);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
    }
}
