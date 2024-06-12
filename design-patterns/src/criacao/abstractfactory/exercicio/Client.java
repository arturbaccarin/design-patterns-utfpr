package criacao.abstractfactory.exercicio;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        PrinterFactory factory;

        Random rand = new Random();
        if (rand.nextBoolean()) {
            factory = new ConsolePrinterFactory();
        } else {
            factory = new FilePrinterFactory();
        }

        Printer printer = factory.createPrinter();

        printer.print("Hello world!");
    }
}
