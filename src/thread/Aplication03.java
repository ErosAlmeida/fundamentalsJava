package thread;

import java.io.IOException;

public class Aplication03 {
    static void main(String[] args)  {
        Contador c = new Contador();
        c.start();
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
