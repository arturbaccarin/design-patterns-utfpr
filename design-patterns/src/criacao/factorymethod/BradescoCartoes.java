package criacao.factorymethod;

// ConcreteCreator: Subclasses que implementam o método de fábrica para retornar instâncias de ConcreteProduct.
public class BradescoCartoes extends FornecedorCartao {

    public CartaoCredito criarCartao(String bandeira) {
        CartaoCredito cartao;

        if (bandeira.equals("visa")) {
            cartao = new CartaoCreditoBradescoVisa();
        } else if (bandeira.equals("mastercard")) {
            cartao = new CartaoCreditoBradescoMastercard();
        } else {
            cartao = new CartaoCreditoBradesco();
        }

        return cartao;
    }
}
