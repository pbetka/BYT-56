package Mediator;

public class SmartHomeClient {
    public static void main(String[] args) {
        SmartHomeMediator smartHomeHub = new SmartHomeHub();

        SmartDevice smartLight = new SmartLight(smartHomeHub);
        SmartDevice smartThermostat = new SmartThermostat(smartHomeHub);
        SmartDevice smartSpeaker = new SmartSpeaker(smartHomeHub);

        ((SmartHomeHub) smartHomeHub).addDevice(smartLight);
        ((SmartHomeHub) smartHomeHub).addDevice(smartThermostat);
        ((SmartHomeHub) smartHomeHub).addDevice(smartSpeaker);

        ((SmartLight) smartLight).turnOn();
        ((SmartLight) smartLight).turnOff();
        ((SmartThermostat) smartThermostat).setTemperature(22);
        ((SmartThermostat) smartThermostat).setTemperature(25);
        ((SmartSpeaker) smartSpeaker).playMusic("Jazz");
        ((SmartSpeaker) smartSpeaker).stopMusic();
    }
}