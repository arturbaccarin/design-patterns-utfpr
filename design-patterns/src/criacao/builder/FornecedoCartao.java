package criacao.builder;

// Director: Entidade que dirige o processo de construção, utilizando os métodos do Builder para criar o produto.
public class FornecedoCartao {

    private CartaoCreditoBuilder bandeira;

    public void FornecedorCartao(CartaoCreditoBuilder bandeira) {
        this.bandeira = bandeira;
    }

    public void gerarCartao() {

        this.bandeira.liberarLimite();
        this.bandeira.codigoSeguranca();
        this.bandeira.senha();
        this.bandeira.emitir();
    }

    public CartaoCredito getCartao() {
        return this.bandeira.getCartao();
    }
}
