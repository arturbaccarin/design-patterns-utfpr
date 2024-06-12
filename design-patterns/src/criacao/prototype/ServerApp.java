package criacao.prototype;

// ConcretePrototype: Implementa a interface clone do Prototype. 
// Esta classe faz a clonagem de si mesma, retornando uma cópia do objeto.
public class ServerApp extends Server {

    public ServerApp() {
    }

    protected ServerApp(ServerApp server) {
        this.tipo = server.tipo;
        this.nome = server.nome;
        this.app = server.app;
        this.linux = server.linux;
    }

    public Server clone() {
        return new ServerApp(this);
    }
}
