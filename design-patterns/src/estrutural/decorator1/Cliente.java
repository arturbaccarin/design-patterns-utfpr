package estrutural.decorator1;

public class Cliente {

    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("Delcidio", "4111 2684 6854 1567", "01/20", "123", 1000);

        AutorizadorCartao autorizador = new AnalisadorRisco(new AutorizadorCielo());

        autorizador.autorizar(cartao, 500.00);
    }
}
