package comportamental.strategy;

public class LogDatabase implements Logger {
    public boolean log(String mensagem) {
        System.out.println("Mensagem: " + mensagem + " gravada no Banco de Dados!");
        return true;
    }
}
