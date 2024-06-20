package estrutural.decorator2;

public class RevisaoBasica implements ServicoAutomotivo {

    @Override
    public float custo() {
        return 200.00f;
    }

    @Override
    public String descricao() {
        return "Revisao basica";
    }

}
