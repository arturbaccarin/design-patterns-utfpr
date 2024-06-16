package criacao.factorymethod.exercicio2;

public class ProvedorConfidencialCreator implements ProvedorCreator {

    @Override
    public Provedor criarProvedor() {
        return new ProvedorConfidencial();
    }
}
