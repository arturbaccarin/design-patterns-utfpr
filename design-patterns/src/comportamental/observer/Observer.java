package comportamental.observer;

// Interface dependente do objeto Subject
// ou seja, interface dos clientes que desejam observar
// e manter o Subject atualizado
public interface Observer {

    // Atualiza os dados no Observer
    // Método chamado pelo subject
    public void update();
}
