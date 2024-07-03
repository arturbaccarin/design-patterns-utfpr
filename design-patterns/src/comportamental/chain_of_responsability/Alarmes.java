package comportamental.chain_of_responsability;

public class Alarmes extends ChecarCasa {

    public void checar(SituacaoCasa casa) {
        if (!casa.alarmeLigado) {
            System.out.println("Alerta! Alarme não ligado.");
        }

        this.proximo(casa);
    }
}
