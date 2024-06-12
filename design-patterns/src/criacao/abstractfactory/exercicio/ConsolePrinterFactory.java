package criacao.abstractfactory.exercicio;

// ConcreteFactory
public class ConsolePrinterFactory implements PrinterFactory {
    public Printer createPrinter() {
        return new ConsolePrinter();
    }
}
