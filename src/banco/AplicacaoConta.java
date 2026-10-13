package banco;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoConta {
    static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.getSaldo(1000);
        try {
            c1.sacar(200);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }

//        List<ContaCorrente> lista = new ArrayList<>();
//
//        lista.add(new ContaCorrente());
//        lista.add(new ContaCorrente());
//        lista.add(new ContaCorrente());
//
//        for(ContaCorrente contaCorrente : lista){
//            System.out.println(contaCorrente.getSaldo());
//        }

    }
}
