package criacao.builder.exercicio1;

public class Atendente {
    private PedidoBuilder builder;

    public Atendente(PedidoBuilder builder) {
        this.builder = builder;
    }

    public void construirPedido(String sanduiche, String batata, String brinquedo, String bebida) {
        builder.adicionarSanduiche(sanduiche);
        builder.adicionarBatata(batata);
        builder.adicionarBrinquedo(brinquedo);
        builder.adicionarBebida(bebida);
    }

    public Pedido getPedido() {
        return builder.getPedido();
    }
}