package criacao.abst.factory;

// Como usar
public class Cliente {

    PagamentosFactory pagamento = new MoipFactory();

    Boleto boleto = pagamento.gerarBoleto();

    void MostrarBoleto() {
        System.out.println(boleto.dadosBoleto());
    }
}
