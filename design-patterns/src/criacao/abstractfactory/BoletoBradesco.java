package criacao.abstractfactory;

// ConcreteProduct:Implementações concretas da AbstractProduct.
public class BoletoBradesco implements Boleto {

    public String dadosBoleto() {
        return "Boleto Bradesco: XXXX.YYYY.ZZZ";
    }
}