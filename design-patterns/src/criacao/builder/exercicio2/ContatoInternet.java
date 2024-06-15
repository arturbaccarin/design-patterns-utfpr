package criacao.builder.exercicio2;

public class ContatoInternet extends Contato {

    protected String nome;
    protected String email;

    @Override
    public String toString() {
        return "ContatoInternet{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
