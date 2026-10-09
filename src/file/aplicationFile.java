package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class aplicationFile {
    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("entrada.txt")){
            byte[] buffer = new byte[1024];

            is.read(buffer);

            String s = new String(buffer);
            System.out.println(s);
        }
    }
}
