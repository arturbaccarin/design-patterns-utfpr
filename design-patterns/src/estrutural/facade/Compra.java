package estrutural.facade;

public class Compra {

    public Produto produto;
    public Frete frete;
    public Estoque estoque;
    public Pagamentos pagamento;

    public void adicionarCarrinhoCompras() {

        this.produto = new Produto("iPhone", 10000.00f);
        this.estoque = new Estoque();

        if (this.estoque.estaDisponivel()) {
            System.out.println("Adicionado ao carrinho!");
        }
    }

    public void confirmarCompra() {

        this.pagamento = new Pagamentos();
        this.frete = new Frete();

        double valorCompra = this.frete.calcular(10) + this.produto.valor;

        boolean confirmado = this.pagamento.pagar(valorCompra);

        if (confirmado) {
            this.frete.entregar(this.produto);
        }
    }
}
