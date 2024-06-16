package criacao.factorymethod.exercicio2;

public class Main {

    public static void main(String[] args) {
        LogCreator creator;
        Log log;
        String mensagem = "Hello world!";

        String formato = "console";

        switch (formato) {
            case "arquivo":
                creator = new LogArquivoCreator();
                log = creator.criarLog();
                log.notificar(mensagem);
                break;

            case "console":
                creator = new LogConsoleCreator();
                log = creator.criarLog();
                log.notificar(mensagem);
                break;

            default:
                System.out.println("valor inválido");
                break;
        }
    }
}
