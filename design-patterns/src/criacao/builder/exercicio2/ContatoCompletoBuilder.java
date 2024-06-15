package criacao.builder.exercicio2;

public class ContatoCompletoBuilder implements Builder {
    private ContatoCompleto contato = new ContatoCompleto();

    public void setNome(String nome) {
        contato.nome = nome;
    }

    public void setEmail(String email) {
        contato.email = email;
    }

    public void setTelefone(String telefone) {
        contato.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        contato.endereco = endereco;
    }

    public Contato build() {
        return contato;
    }
}
