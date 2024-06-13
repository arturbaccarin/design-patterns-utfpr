package criacao.abstractfactory.exercicio2;

public class PizzaioloCalabresaFactory implements PizzariaFactory {
    public Pizza createPizza() {
        return new PizzaCalabresa();
    }

    public Calzone createCalzone() {
        return new CalzoneCalabresa();
    }
}
