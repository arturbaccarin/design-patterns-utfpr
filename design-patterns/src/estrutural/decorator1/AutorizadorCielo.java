package estrutural.decorator1;

public class AutorizadorCielo implements AutorizadorCartao {

    @Override
    public boolean autorizar(CartaoCredito cartao, double valor) {
        if (cartao.limite > valor) {
            System.out.println("Cartão de " + cartao.cliente + " Autorizado");
            return true;
        }

        return false;
    }
}
