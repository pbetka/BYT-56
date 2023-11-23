package Mediator;

public abstract class Colleague {
    protected MediatorInterface mediatorInterface;

    public Colleague(MediatorInterface mediatorInterface) {
        this.mediatorInterface = mediatorInterface;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}