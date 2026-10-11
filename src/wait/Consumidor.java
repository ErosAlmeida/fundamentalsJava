package wait;

import java.util.Random;

public class Consumidor extends Thread{
    private static Random random = new Random();
    private Buffer buffer;

    public Consumidor(Buffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        while (true){
            buffer.consumir();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
