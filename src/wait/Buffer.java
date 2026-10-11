package wait;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private static final int MAX = 10;

    private Queue<Integer> fila = new LinkedList<Integer>();

    public void produzir(int n){
        fila.offer(n);
    }

    public int consumir(){
        int n = fila.poll();
        return n;
    }
}
