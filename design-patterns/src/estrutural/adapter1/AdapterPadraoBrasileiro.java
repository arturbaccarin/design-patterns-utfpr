package estrutural.adapter1;

// Adapter extende a interface alvo, neste caso o Padrão Americano que queremos. 
public class AdapterPadraoBrasileiro extends PadraoAmericano {
    private PadraoBrasileiro tomadaBrasileira;

    public AdapterPadraoBrasileiro(PadraoBrasileiro tomadaBrasileira) {
        this.tomadaBrasileira = tomadaBrasileira;
    }

    // sobrescreve o método ligarTomadaTresPinos, para que ele faça uma chamada à
    // função correspondente no Padrão Brasileiro.
    @Override
    public boolean ligarTomadaTresPino() {
        return this.tomadaBrasileira.ligarTomadaBrasileira();
    }
}
