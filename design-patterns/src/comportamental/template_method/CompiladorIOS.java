package comportamental.template_method;

public class CompiladorIOS extends Compilador {

    public void gerarIcones() {
        System.out.println("Gerando ícones para iOS.");
    }

    public void carregarCodigoFonte() {
        System.out.println("Carregando código-fonte para iOS.");
    }

    public void gerarApp() {
        System.out.println("Gerando App para iOS.");
    }

    public void publicar() {
        System.out.println("Publicando na App Store.");
    }
}
