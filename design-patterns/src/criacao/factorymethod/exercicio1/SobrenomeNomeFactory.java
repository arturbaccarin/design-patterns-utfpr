package criacao.factorymethod.exercicio1;

public class SobrenomeNomeFactory implements Factory {

    @Override
    public NomeCompleto criarNome(String nomeCompleto) {
        String[] partes = nomeCompleto.split(", ");
        String sobrenome = partes[0];
        String nome = partes[1];
        return new NomeCompleto(nome, sobrenome);
    }
}
