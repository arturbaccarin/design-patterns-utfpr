package criacao.builder.exercicio2;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construirContato(String nome, String endereco, String telefone, String email) {
        builder.setNome(nome);
        builder.setEndereco(endereco);
        builder.setTelefone(telefone);
        builder.setEmail(email);
    }
}
