package criacao.singleton;

// A classe mantem o controle da instanciação
public class Singleton {

    // Atributo instancia do tipo Singleton
    // Responsável por salvar a instância única da classe
    private static Singleton instancia;

    // Construtor deve ser privado, assim evita-se que
    // novas instâncias sejam criadas por classes externas
    private Singleton() {
    };

    // Retorna a instância de uma classe
    public static Singleton getInstancia() {
        // Se a instância não existir ainda
        if (instancia == null) {
            instancia = new Singleton();
        }

        return instancia;
    }
}
