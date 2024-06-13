package criacao.abstractfactory.exercicio1;

// ConcreteFactory
public class FilePrinterFactory implements PrinterFactory {
    public Printer createPrinter() {
        return new FilePrinter();
    }
}
