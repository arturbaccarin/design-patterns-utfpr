package comportamental.strategy;

public class LogFile implements Logger {
    public boolean log(String mensagem) {
        System.out.println("Mensagem: " + mensagem + " gravada no arquivo");
        return true;
    }
}
