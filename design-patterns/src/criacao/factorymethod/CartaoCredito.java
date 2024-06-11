package criacao.factorymethod;

// Product: Interface ou classe abstrata que define a interface dos objetos que a fábrica cria.
public abstract class CartaoCredito {

    protected String nome;
    protected String senha;
    protected String codigo;
    protected Double limite;

    public abstract void liberarLimite();

    public abstract void codigoSeguranca();

    public abstract void senha();

    public abstract void emitir();

    public abstract void enviar();

}
