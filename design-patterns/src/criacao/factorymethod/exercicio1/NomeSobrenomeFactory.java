package criacao.factorymethod.exercicio1;

public class NomeSobrenomeFactory implements Factory {

    @Override
    public NomeCompleto criarNome(String nomeCompleto) {
        String[] partes = nomeCompleto.split(" ", 2);
        String nome = partes[0];
        String sobrenome = partes[1];
        return new NomeCompleto(nome, sobrenome);
    }
}
