package criacao.factorymethod;

// ConcreteProduct: Implementações concretas da interface Product.
public class CartaoCreditoBradescoVisa extends CartaoCredito {

    public CartaoCreditoBradescoVisa() {
        this.nome = "Cliente";
    }

    @Override
    public void liberarLimite() {
        this.limite = 1000.00;
    }

    @Override
    public void codigoSeguranca() {
    }

    @Override
    public void senha() {
    }

    @Override
    public void emitir() {
    }

    @Override
    public void enviar() {
    }
}
