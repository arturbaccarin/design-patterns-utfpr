package criacao.factorymethod.exercicio2;

public class LogArquivoCreator implements LogCreator {

    @Override
    public Log criarLog() {
        return new LogArquivo();
    }
}
