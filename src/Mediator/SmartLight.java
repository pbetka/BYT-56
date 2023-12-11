package Mediator;

public class SmartLight extends SmartDevice {
    public SmartLight(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Smart Light received: " + message);
    }

    public void turnOn() {
        sendMessage("Turn on the light");
    }

    public void turnOff() {
        sendMessage("Turn off the light");
    }
}