package criacao.abstractfactory;

// Client: Utiliza a AbstractFactory para criar produtos.
public class Cliente {

    PagamentosFactory pagamento = new MoipFactory();

    Boleto boleto = pagamento.gerarBoleto();

    void MostrarBoleto() {
        System.out.println(boleto.dadosBoleto());
    }
}
