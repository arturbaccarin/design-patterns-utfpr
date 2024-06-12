package criacao.abstractfactory.exercicio;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

    public void print(String message) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
