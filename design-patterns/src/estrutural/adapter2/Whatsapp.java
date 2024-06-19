package estrutural.adapter2;

public class Whatsapp implements MessagePhone {

    @Override
    public void message(String contact, String text) {
        System.out.println("To: " + contact);
        System.out.println("Message: " + text);
    }

    @Override
    public void enviar() {
        System.out.println("Sent!");
    }

}
