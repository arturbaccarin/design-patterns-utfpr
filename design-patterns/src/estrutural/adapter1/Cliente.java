package estrutural.adapter1;

public class Cliente {
    public static void main(String[] args) {
        PadraoBrasileiro tomadaBrasileira = new PadraoBrasileiro();

        AdapterPadraoBrasileiro adapter = new AdapterPadraoBrasileiro(tomadaBrasileira);

        adapter.ligarTomadaTresPino();
    }
}
