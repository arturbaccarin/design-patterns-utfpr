package criacao.abstractfactory.exercicio;

// ConcreteProduct
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
