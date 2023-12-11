package Mediator;

public class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Smart Speaker received: " + message);
    }

    public void playMusic(String music) {
        sendMessage("Playing " + music);
    }

    public void stopMusic() {
        sendMessage("Music stopped");
    }
}
