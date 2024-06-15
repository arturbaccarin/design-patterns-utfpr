package criacao.builder.exercicio2;

public class ContatoTelefoneBuilder implements Builder {

    private ContatoTelefone contato = new ContatoTelefone();

    public void setNome(String nome) {
        contato.nome = nome;
    }

    public void setEmail(String email) {
    }

    public void setTelefone(String telefone) {
        contato.telefone = telefone;
    }

    public void setEndereco(String endereco) {
    }

    public Contato build() {
        return contato;
    }
}