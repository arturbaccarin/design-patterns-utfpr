package criacao.builder.exercicio2;

public class ContatoTelefone extends Contato {

    protected String nome;
    protected String telefone;

    @Override
    public String toString() {
        return "ContatoTelefone{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}