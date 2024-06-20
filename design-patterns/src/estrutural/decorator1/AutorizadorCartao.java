package estrutural.decorator1;

public interface AutorizadorCartao {

    public boolean autorizar(CartaoCredito cartao, double valor);
}
