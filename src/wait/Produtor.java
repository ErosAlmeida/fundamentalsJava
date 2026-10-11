package wait;

import java.util.Random;

public class Produtor extends Thread{
    private static Random random = new Random();
    private Buffer buffer;

    public Produtor(Buffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        while (true){
            buffer.produzir(random.nextInt(10));
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
