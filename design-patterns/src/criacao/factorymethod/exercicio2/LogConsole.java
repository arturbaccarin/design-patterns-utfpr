package criacao.factorymethod.exercicio2;

public class LogConsole implements Log {

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
