package estrutural.adapter1;

public class PadraoBrasileiro {

    public boolean ligarTomadaBrasileira() {
        conectarTomada();
        return true;
    }

    public void conectarTomada() {
        System.out.println("Ligado na tomada de padrão brasileiro");
    }
}
