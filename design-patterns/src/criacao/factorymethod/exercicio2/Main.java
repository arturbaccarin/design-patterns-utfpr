package criacao.factorymethod.exercicio2;

public class Main {

    public static void main(String[] args) {
        ProvedorCreator creator;
        Provedor provedor;

        String senha = "designpatterns";

        if (senha == "designpatterns") {
            creator = new ProvedorConfidencialCreator();
        } else {
            creator = new ProvedorPublicoCreator();
        }

        provedor = creator.criarProvedor();
        provedor.notificar();
    }
}
