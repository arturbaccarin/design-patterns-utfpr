package criacao.builder;

// ConcreteBuilder: Implementação concreta da interface Builder que constrói e monta as partes do produto.
public class CartaoCreditoVisa extends CartaoCreditoBuilder {

    public void liberarLimite() {
        this.cartao.limite = 100D;
    }

    public void codigoSeguranca() {
        this.cartao.codigo = "123";
    }

    public void senha() {
        this.cartao.senha = "123456";
    }

    public void emitir() {
        System.out.println("Cartao emitido");
    }
}
