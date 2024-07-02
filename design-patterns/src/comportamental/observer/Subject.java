package comportamental.observer;

// Interface de objeto único que queremos observar
// e manter atualizado em diversos clientes.
public interface Subject {

    // Adiciona um novo observer na lista de observer
    public void attach(Observer observer);

    // Remove um observer da lista de observers
    public void detach(Observer observer);

    // Método responsável por notificar os observer
    // quando o object subject for alterado
    public void notificar();
}
