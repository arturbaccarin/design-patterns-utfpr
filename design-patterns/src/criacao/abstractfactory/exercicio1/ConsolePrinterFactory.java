package criacao.abstractfactory.exercicio1;

// ConcreteFactory
public class ConsolePrinterFactory implements PrinterFactory {
    public Printer createPrinter() {
        return new ConsolePrinter();
    }
}
