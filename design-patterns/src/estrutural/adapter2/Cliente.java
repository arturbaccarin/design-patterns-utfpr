package estrutural.adapter2;

public class Cliente {

    public void enviarMensagem(Mensagem msg) {
        msg.para("8858-1534");
        msg.mensagem("Oi, tudo bem?");
        msg.enviar();
    }

    public static void main(String[] args) {
        new Cliente().enviarMensagem(new WhatsappAdapter(new Whatsapp()));
    }
}
