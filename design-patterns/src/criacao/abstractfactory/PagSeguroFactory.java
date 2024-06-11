package criacao.abstractfactory;

// ConcreteFactory: Implementações concretas da AbstractFactory, criando instâncias específicas dos produtos.
public class PagSeguroFactory implements PagamentosFactory {

    public Boleto gerarBoleto() {
        return new BoletoBradesco();
    }
}
