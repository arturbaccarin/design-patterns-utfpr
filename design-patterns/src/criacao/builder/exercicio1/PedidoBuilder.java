package criacao.builder.exercicio1;

public interface PedidoBuilder {

    void adicionarSanduiche(String tipo);

    void adicionarBatata(String tamanho);

    void adicionarBrinquedo(String tipo);

    void adicionarBebida(String tipo);

    Pedido getPedido();
}
