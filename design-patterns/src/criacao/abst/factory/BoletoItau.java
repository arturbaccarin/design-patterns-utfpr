package criacao.abst.factory;

// Produtos Concretos
public class BoletoItau implements Boleto {

    public String dadosBoleto() {
        return "Boleto Itau: XXXX.YYYY.ZZZZ";
    }
}
