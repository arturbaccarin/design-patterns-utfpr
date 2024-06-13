package criacao.abstractfactory.exercicio2;

public class PizzaioloPresuntoFactory implements PizzariaFactory {
    public Pizza createPizza() {
        return new PizzaPresunto();
    }

    public Calzone createCalzone() {
        return new CalzonePresunto();
    }
}