package estrutural.adapter2;

public class WhatsappAdapter implements Mensagem {
    public Whatsapp wa;
    public String numero;

    public WhatsappAdapter(Whatsapp wa) {
        this.wa = wa;
    }

    @Override
    public void para(String numero) {
        this.numero = numero;
    }

    @Override
    public void mensagem(String texto) {
        this.wa.message(this.numero, texto);
    }

    @Override
    public void enviar() {
        this.wa.enviar();
    }

}
