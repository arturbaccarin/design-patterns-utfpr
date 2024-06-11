package criacao.factorymethod;

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
