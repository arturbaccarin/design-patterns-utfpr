package criacao.builder.exercicio2;

public class ContatoCompleto extends Contato {

    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;

    @Override
    public String toString() {
        return "ContatoCompleto{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
