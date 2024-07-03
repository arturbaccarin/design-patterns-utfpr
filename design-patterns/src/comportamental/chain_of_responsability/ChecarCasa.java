package comportamental.chain_of_responsability;

public abstract class ChecarCasa {

    protected ChecarCasa sucessor;

    public abstract void checar(SituacaoCasa casa);

    public void setSucessor(ChecarCasa sucessor) {
        this.sucessor = sucessor;
    }

    public void proximo(SituacaoCasa casa) {
        if (this.sucessor != null) {
            this.sucessor.checar(casa);
        }
    }
}
