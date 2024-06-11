package criacao.builder;

// Director
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
