package criacao.factorymethod.exercicio2;

public class ProvedorPublicoCreator implements ProvedorCreator {

    @Override
    public Provedor criarProvedor() {
        return new ProvedorPublico();
    }
}
