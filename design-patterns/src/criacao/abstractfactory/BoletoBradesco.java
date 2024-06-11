package criacao.abstractfactory;

// Produtos Concretos
public class BoletoBradesco implements Boleto {

    public String dadosBoleto() {
        return "Boleto Bradesco: XXXX.YYYY.ZZZ";
    }
}