package comportamental.strategy;

public class Cliente {

    public void gravarLog(String mensagem, Logger logger) {
        logger.log(mensagem);
    }

    public static void main(String[] args) {

        new Cliente().gravarLog("Teste", new LogFile());
    }
}
