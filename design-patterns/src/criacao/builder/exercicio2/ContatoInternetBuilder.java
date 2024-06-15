package criacao.builder.exercicio2;

public class ContatoInternetBuilder implements Builder {

    private ContatoInternet contato = new ContatoInternet();

    public void setNome(String nome) {
        contato.nome = nome;
    }

    public void setEmail(String email) {
        contato.email = email;
    }

    public void setTelefone(String telefone) {
    }

    public void setEndereco(String endereco) {
    }

    public Contato build() {
        return contato;
    }
}
