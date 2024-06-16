package criacao.factorymethod.exercicio2;

public class LogConsoleCreator implements LogCreator {

    @Override
    public Log criarLog() {
        return new LogConsole();
    }
}
