package estrutural.decorator2;

public class Cliente {

    public static void main(String[] args) {
        // ServicoAutomotivo servico = new RevisaoBasica();

        // System.out.println(servico.descricao());

        ServicoAutomotivo servico = new Alinhamento(new TrocaOleo(new RevisaoBasica()));

        System.out.println(servico.descricao());
    }

}
