package comportamental.observer;

import java.util.ArrayList;
import java.util.List;

public class UsersService implements Subject {

    protected List<Observer> observers;
    protected UsuariosConectados usuarios;

    public UsersService() {
        this.observers = new ArrayList<>();
        this.usuarios = new UsuariosConectados();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notificar() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setState(String usuario) {
        this.usuarios.lista.add(usuario);
        notificar();
    }

    public UsuariosConectados getState() {
        return this.usuarios;
    }
}
