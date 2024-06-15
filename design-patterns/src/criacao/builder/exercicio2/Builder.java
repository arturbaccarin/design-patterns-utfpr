package criacao.builder.exercicio2;

public interface Builder {

    void setNome(String nome);

    void setEmail(String tamanho);

    void setTelefone(String tipo);

    void setEndereco(String tipo);

    Contato build();
}
