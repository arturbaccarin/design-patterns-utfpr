package criacao.factorymethod.exercicio2;

public class Main {

    public static void main(String[] args) {
        LogCreator creator;
        Log log;
        String formato = "arquivo";

        switch (formato) {
            case "arquivo":
                creator = new LogArquivoCreator();
                log = creator.criarLog();
                break;

            case "console":
                creator = new LogConsoleCreator();
                log = creator.criarLog();
                break;

            default:
                System.out.println("valor inválido");
                return;
        }

        for (int i = 0; i < 10; i++) {
            log.notificar(Integer.toString(i));
        }
    }
}
