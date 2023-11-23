package Mediator;

public class Colleague2 extends Colleague {
    public Colleague2(MediatorInterface mediatorInterface) {
        super(mediatorInterface);
    }

    @Override
    public void send(String message) {
        mediatorInterface.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague2 received: " + message);
    }
}
