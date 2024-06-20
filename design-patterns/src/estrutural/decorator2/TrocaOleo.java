package estrutural.decorator2;

public class TrocaOleo implements ServicoAutomotivo {

    private ServicoAutomotivo servico;

    public TrocaOleo(ServicoAutomotivo servico) {
        this.servico = servico;
    }

    @Override
    public float custo() {
        return this.servico.custo() + 250.0f;
    }

    @Override
    public String descricao() {
        return this.servico.descricao() + ", e Troca de óleo";
    }

}
