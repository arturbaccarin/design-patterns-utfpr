package comportamental.chain_of_responsability;

public class Portas extends ChecarCasa {

    public void checar(SituacaoCasa casa) {
        if (!casa.portasTrancadas) {
            System.out.println("Alerta! Portas não trancadas.");
        }

        this.proximo(casa);
    }
}
