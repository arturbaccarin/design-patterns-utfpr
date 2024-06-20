package estrutural.facade;

public class Frete {

    public double calcular(double valor) {
        return valor * 0.10D;
    }

    public void entregar(Produto produto) {
        System.out.println("ordem de serviço agendada!");
    }
}
