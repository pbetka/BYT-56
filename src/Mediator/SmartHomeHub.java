package Mediator;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements SmartHomeMediator {
    private List<SmartDevice> devices;

    public SmartHomeHub() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void sendMessage(String message, SmartDevice device) {
        for (SmartDevice d : devices) {
            if (d != device) {
                d.receiveMessage(device.getClass().getSimpleName() + ": " + message);
            }
        }
    }
}