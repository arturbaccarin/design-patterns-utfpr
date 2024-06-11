package criacao.builder;

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
