package Mediator;

public class SmartThermostat extends SmartDevice {
    public SmartThermostat(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Smart Thermostat received: " + message);
    }

    public void setTemperature(double temperature) {
        sendMessage("Temperature set to " + temperature + "°C");
    }
}
