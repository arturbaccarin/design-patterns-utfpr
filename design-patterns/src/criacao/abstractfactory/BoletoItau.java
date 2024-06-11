package criacao.abstractfactory;

// Produtos Concretos
public class BoletoItau implements Boleto {

    public String dadosBoleto() {
        return "Boleto Itau: XXXX.YYYY.ZZZZ";
    }
}
