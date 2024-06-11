package criacao.factorymethod;

// Creator: Classe que declara o método de fábrica (factory method), que retorna um objeto do tipo Product. 
// A classe Creator pode também definir um método padrão para criar objetos.
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
