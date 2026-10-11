package multiThread;

public class MyThread extends Thread{

    private Contador1 contador;

    public MyThread(Contador1 c){
        contador = c;
    }

    public void run(){
        for (int i=0; i< 100; i++){
            contador.increment();
        }
    }


}
