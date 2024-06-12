package criacao.prototype;

// Prototype: Declara uma interface para clonar a si mesmo. 
// Normalmente, essa interface é uma operação chamada clone ou algo similar.
public abstract class Server {

    public String nome;
    public String linux;
    public String ip;
    public String tipo;
    public String app;

    public abstract Server clone();

    public void info() {
        String inf = this.nome + " - " + this.linux + " - " + this.app;
        System.out.println("Server: " + this.ip + " | Info: " + inf);
    }
}
