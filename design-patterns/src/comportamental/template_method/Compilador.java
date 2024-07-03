package comportamental.template_method;

public abstract class Compilador {

    public final void iniciar() {
        this.carregarCodigoFonte();
        this.gerarIcones();
        this.gerarApp();
        this.publicar();
        this.fim();
    }

    public abstract void gerarIcones();

    public abstract void carregarCodigoFonte();

    public abstract void gerarApp();

    public abstract void publicar();

    public void fim() {
        System.out.println("Processo finalizado!");
    }
}
