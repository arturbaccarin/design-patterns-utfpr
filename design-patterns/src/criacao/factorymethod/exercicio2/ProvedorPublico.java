package criacao.factorymethod.exercicio2;

import java.io.FileWriter;
import java.io.IOException;

public class ProvedorPublico implements Provedor {

    @Override
    public void notificar() {
        String mensagem = """
                Estas são informações públicas sobre
                qualquer coisa. Todo mundo pode ver
                este arquivo.
                """;

        try (FileWriter writer = new FileWriter("publico.txt")) {
            writer.write(mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
