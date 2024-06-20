package estrutural.facade;

public class Pagamentos {

    public boolean pagar(double valor) {
        System.out.println("Pagamento de: " + valor + " confirmado!");

        return true;
    }
}
