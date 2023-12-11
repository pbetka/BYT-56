package Mediator;

public abstract class SmartDevice {
    protected SmartHomeMediator mediator;

    public SmartDevice(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message);

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
}