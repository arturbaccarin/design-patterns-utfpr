package criacao.singleton.exercicio1;

class Incremental {
    private static int count = 0;
    private static int numero;

    private static Incremental instancia;

    private Incremental() {
    };

    public static Incremental getInstancia() {
        if (instancia == null) {
            instancia = new Incremental();
        } else {
            numero = ++count;
        }

        return instancia;
    }

    public String toString() {
        return "Incremental " + numero;
    }

}
