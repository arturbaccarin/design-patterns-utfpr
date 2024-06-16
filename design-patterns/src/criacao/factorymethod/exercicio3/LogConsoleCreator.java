package criacao.factorymethod.exercicio3;

public class LogConsoleCreator implements LogCreator {

    @Override
    public Log criarLog() {
        return new LogConsole();
    }
}
