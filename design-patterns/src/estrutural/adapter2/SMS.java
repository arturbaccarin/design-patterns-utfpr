package estrutural.adapter2;

public class SMS implements Mensagem {

    @Override
    public void para(String numero) {
        System.out.println("Enviar um SMS para: " + numero);
    }

    @Override
    public void mensagem(String texto) {
        System.out.println("Mensagem: " + texto);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem enviada!");
    }
}
