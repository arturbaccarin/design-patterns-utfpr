package criacao.builder.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        // Escolhe o builder específico
        PedidoBuilder builder = new Funcionario();

        // Atendente usa o builder para construir o pedido
        Atendente atendente = new Atendente(builder);
        atendente.construirPedido("Cheeseburger", "Média", "Carrinho", "Coca");

        // Obter o pedido finalizado
        Pedido pedido = atendente.getPedido();
        System.out.println(pedido);
    }
}
