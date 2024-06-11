package criacao.abstractfactory;

// ConcreteFactory: Implementações concretas da AbstractFactory, criando instâncias específicas dos produtos.
public class MoipFactory implements PagamentosFactory {

    public Boleto gerarBoleto() {
        return new BoletoItau();
    }
}
