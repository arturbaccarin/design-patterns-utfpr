package criacao.factorymethod.exercicio3;

public class LogArquivoCreator implements LogCreator {

    @Override
    public Log criarLog() {
        return new LogArquivo();
    }
}
