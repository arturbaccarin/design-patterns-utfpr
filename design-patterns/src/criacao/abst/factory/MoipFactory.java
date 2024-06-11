package criacao.abst.factory;

// Fábrica Concreta
public class MoipFactory implements PagamentosFactory {

    public Boleto gerarBoleto() {
        return new BoletoItau();
    }
}
