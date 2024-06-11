package criacao.abstractfactory;

// Fábrica Concreta
public class PagSeguroFactory implements PagamentosFactory {

    public Boleto gerarBoleto() {
        return new BoletoBradesco();
    }
}
