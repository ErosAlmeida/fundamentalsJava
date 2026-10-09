
package apiIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplication02 {

    public static void main(String[] args) {

        try (
                FileInputStream in = new FileInputStream("entrada.txt");
                FileOutputStream out = new FileOutputStream("saida.txt")
        ) {
            transfer(in, out);
            System.out.println("Arquivo copiado com sucesso!");
//teste
        } catch (IOException e) {
            System.out.println("Erro ao copiar o arquivo: " + e.getMessage());
        }
    }

    private static void transfer(InputStream in, OutputStream out)
            throws IOException {

        byte[] buffer = new byte[1024];

        int bytesLidos;

        while ((bytesLidos = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesLidos);
        }
    }
}
