package criacao.builder;

// Builder: Interface que declara métodos para criar as diferentes partes de um objeto complexo.
public abstract class CartaoCreditoBuilder {

    protected CartaoCredito cartao;

    public CartaoCreditoBuilder() {
        this.cartao = new CartaoCredito();
    }

    public abstract void liberarLimite();

    public abstract void codigoSeguranca();

    public abstract void senha();

    public abstract void emitir();

    public CartaoCredito getCartao() {
        return this.cartao;
    }
}
