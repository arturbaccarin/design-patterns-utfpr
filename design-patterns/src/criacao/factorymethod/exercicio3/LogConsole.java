package criacao.factorymethod.exercicio3;

public class LogConsole implements Log {

    @Override
    public void notificar(String mensagem) {
        System.out.println(mensagem);
    }
}
