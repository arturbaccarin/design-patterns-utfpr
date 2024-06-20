package estrutural.decorator1;

public class CartaoCredito {

    protected String cliente;
    protected String numero;
    protected String validade;
    protected String codigo;
    protected double limite;

    public CartaoCredito(String cliente, String numero, String validade, String codigo, double limite) {
        this.cliente = cliente;
        this.numero = numero;
        this.validade = validade;
        this.codigo = codigo;
        this.limite = limite;
    }
}
