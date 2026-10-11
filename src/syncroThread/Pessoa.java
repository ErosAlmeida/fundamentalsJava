package syncroThread;

public class Pessoa  implements Runnable{
    private ContaBancaria contaBancaria;

    public Pessoa(ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }

    public void run(){
        for(int i = 0; i < 10 ; i++){
            try {
                contaBancaria.sacar(200);
                Thread.sleep(100);

                contaBancaria.depositar(200);
                Thread.sleep(100);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}



