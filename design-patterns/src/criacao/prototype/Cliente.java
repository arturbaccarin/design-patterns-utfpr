package criacao.prototype;

// Client: Cria um novo objeto solicitando a clonagem de um protótipo.
// Usa a interface clone do Prototype para criar um novo objeto a partir de um protótipo existente.
public class Cliente {

    public static void main(String[] args) {
        Server web01 = new ServerApp();

        // Configuração do servidor
        web01.app = "PHP Server";
        web01.tipo = "Aplicação";
        web01.linux = "Ubuntu 14.0";
        web01.nome = "Web01";
        web01.ip = "192.168.0.1";

        // Agora vamos escalar para mais um servidor
        // Porém, não vamos instalar tudo novamente
        // Vamos então criar uma cópia do server web01
        Server web02 = web01.clone();
        web02.ip = "192.168.0.2";
        web02.nome = "Web02";

        web01.info();
        web02.info();
    }
}
