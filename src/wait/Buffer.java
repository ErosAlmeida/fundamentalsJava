package wait;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private static final int MAX = 10;

    private Queue<Integer> fila = new LinkedList<Integer>();

    public synchronized void produzir(int n){
        if (fila.size() == MAX){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        fila.offer(n);
        imprimir();
    }

    public synchronized int consumir(){
        int n = fila.poll();
        imprimir();
        return n;
    }
    private void imprimir(){
        System.out.println("=>");

        for (Integer n : fila){
            System.out.println(n + "");
        }

        System.out.println();
    }
}
