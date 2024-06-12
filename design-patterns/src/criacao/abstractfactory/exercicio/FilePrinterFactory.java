package criacao.abstractfactory.exercicio;

// ConcreteFactory
public class FilePrinterFactory implements PrinterFactory {
    public Printer createPrinter() {
        return new FilePrinter();
    }
}
