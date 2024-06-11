package criacao.abstractfactory;

// ConcreteProduct: Implementações concretas da AbstractProduct.
public class BoletoItau implements Boleto {

    public String dadosBoleto() {
        return "Boleto Itau: XXXX.YYYY.ZZZZ";
    }
}
