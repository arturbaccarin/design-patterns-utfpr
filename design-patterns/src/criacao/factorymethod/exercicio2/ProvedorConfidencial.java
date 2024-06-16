package criacao.factorymethod.exercicio2;

import java.io.FileWriter;
import java.io.IOException;

public class ProvedorConfidencial implements Provedor {

    @Override
    public void notificar() {
        String mensagem = """
                Estas são informações confidenciais,
                o que significa que você
                provavelmente sabe a palavra secreta!
                """;

        try (FileWriter writer = new FileWriter("confidencial.txt")) {
            writer.write(mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
