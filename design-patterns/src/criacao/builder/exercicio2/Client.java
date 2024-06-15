package criacao.builder.exercicio2;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        // Contato Internet
        Builder internetBuilder = new ContatoInternetBuilder();

        director.setBuilder(internetBuilder);

        director.construirContato("Artur", null, null, "admin@example.com");

        Contato contato = internetBuilder.build();

        System.out.println(contato);

        // Contato Telefone
        Builder telefoneBuilder = new ContatoTelefoneBuilder();

        director.setBuilder(telefoneBuilder);

        director.construirContato("Artur", null, "(12) 3456-7890", null);

        contato = telefoneBuilder.build();

        System.out.println(contato);

        // Contato Completo
        Builder completoBuilder = new ContatoCompletoBuilder();

        director.setBuilder(completoBuilder);

        director.construirContato("Artur", "Araras", "(12) 3456-7890", "admin@example.com");

        contato = completoBuilder.build();

        System.out.println(contato);

    }
}
