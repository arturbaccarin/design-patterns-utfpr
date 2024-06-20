package estrutural.decorator2;

public class Alinhamento implements ServicoAutomotivo {

    private ServicoAutomotivo servico;

    public Alinhamento(ServicoAutomotivo servico) {
        this.servico = servico;
    }

    @Override
    public float custo() {
        return this.servico.custo() + 60.0f;
    }

    @Override
    public String descricao() {
        return this.servico.descricao() + ", e Alinhamento";
    }

}