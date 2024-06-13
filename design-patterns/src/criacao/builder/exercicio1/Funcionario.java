package criacao.builder.exercicio1;

public class Funcionario implements PedidoBuilder {

    private Pedido pedido;

    public Funcionario() {
        this.pedido = new Pedido();
    }

    public void adicionarSanduiche(String tipo) {
        pedido.adicionarDentroDaCaixa(tipo);
    }

    public void adicionarBatata(String tamanho) {
        pedido.adicionarDentroDaCaixa("Batata " + tamanho);
    }

    public void adicionarBrinquedo(String tipo) {
        pedido.adicionarDentroDaCaixa("Brinquedo " + tipo);
    }

    public void adicionarBebida(String tipo) {
        pedido.adicionarForaDaCaixa("Bebida " + tipo);
    }

    public Pedido getPedido() {
        return pedido;
    }
}