package estrutural.facade;

public class Estoque {

    public static int quantidade = 2;

    public boolean estaDisponivel() {
        return (quantidade > 0) ? true : false;
    }

    public void itemVendido() {
        quantidade = quantidade - 1;
    }
}
