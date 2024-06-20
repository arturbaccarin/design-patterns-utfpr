package estrutural.decorator1;

public class AnalisadorRisco implements AutorizadorCartao {

    protected AutorizadorCartao autorizador;

    public AnalisadorRisco(AutorizadorCartao autorizador) {
        this.autorizador = autorizador;
    }

    @Override
    public boolean autorizar(CartaoCredito cartao, double valor) {
        if (cartao.cliente.equals("Delcidio")) {
            System.out.println("Auto Risco! Bloquear este cartão de crédito");
            return false;
        }

        System.out.println("sem risco");
        this.autorizador.autorizar(cartao, valor);

        return true;
    }

}
