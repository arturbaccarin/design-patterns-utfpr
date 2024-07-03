package comportamental.chain_of_responsability;

public class Cliente {

    public static void main(String[] args) {
        SituacaoCasa situacao = new SituacaoCasa();

        Portas portas = new Portas();
        Luzes luzes = new Luzes();
        Alarmes alarmes = new Alarmes();

        portas.setSucessor(portas);
        luzes.setSucessor(alarmes);

        portas.checar(situacao);
    }
}
