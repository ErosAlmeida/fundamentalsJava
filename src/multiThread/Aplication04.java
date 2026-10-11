package multiThread;

public class Aplication04 {
    static void main(String[] args) throws Exception {
        MyThread[] threads = new MyThread[1000];
        Contador1 contador1 = new Contador1();
        for(int i = 0; i < threads.length; i++){
            threads[i].start();
        }
        for(int i = 0; i < threads.length; i++){
            threads[i].join();
        }
        System.out.println("Valor" + contador1.getValor());
    }
}
