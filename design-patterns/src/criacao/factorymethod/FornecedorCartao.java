package criacao.factorymethod;

// Creator
public abstract class FornecedorCartao {
    public abstract CartaoCredito criarCartao(String bandeira);

    public CartaoCredito gerarCartao(String bandeira) {

        CartaoCredito cartao;

        cartao = criarCartao(bandeira);

        cartao.liberarLimite();
        cartao.codigoSeguranca();
        cartao.senha();
        cartao.emitir();
        cartao.enviar();

        return cartao;
    }
}
