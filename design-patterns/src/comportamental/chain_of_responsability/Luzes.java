package comportamental.chain_of_responsability;

public class Luzes extends ChecarCasa {

    public void checar(SituacaoCasa casa) {
        if (!casa.luzesApagadas) {
            System.out.println("Alerta! Luzes não apagadas.");
        }

        this.proximo(casa);
    }
}
