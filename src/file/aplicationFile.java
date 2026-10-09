package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class aplicationFile {
    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("entrada.txt")){
            byte[] buffer = new byte[1024];

           int byteslidos =  is.read(buffer);

            String s = new String(buffer, 0, byteslidos);
            System.out.println(s);
        }
    }
}
