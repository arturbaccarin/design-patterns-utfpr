package criacao.factorymethod.exercicio2;

import java.io.FileWriter;
import java.io.IOException;

public class LogArquivo implements Log {

    @Override
    public void notificar(String mensagem) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
