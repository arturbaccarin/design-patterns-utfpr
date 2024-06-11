package criacao.abstractfactory;

// AbstractFactory: Interface ou classe abstrata com métodos para criar cada tipo de produto.
public interface PagamentosFactory {
    public Boleto gerarBoleto();
}
