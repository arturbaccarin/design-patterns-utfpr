package criacao.abstractfactory.exercicio1;

// ConcreteProduct
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
