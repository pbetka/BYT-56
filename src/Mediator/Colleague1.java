package Mediator;

public class Colleague1 extends Colleague {
    public Colleague1(MediatorInterface mediatorInterface) {
        super(mediatorInterface);
    }

    @Override
    public void send(String message) {
        mediatorInterface.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague1 received: " + message);
    }
}
