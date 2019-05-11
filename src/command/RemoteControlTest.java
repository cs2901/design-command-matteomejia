package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light Kitchen = new Light();
        Light LivingRoom = new Light();
        Fan CeilingFan = new Fan();
        Door GarageDoor = new Door();
        Light Stereo = new Light();

        Command KitchenOn = new LightOnCommand(Kitchen);
        Command LivingRoomOn = new LightOnCommand(LivingRoom);
        Command DoorOpen = new DoorOpenCommand(GarageDoor);
        Command FanHigh = new FanHighCommand(CeilingFan);
        Command StereoOn = new LightOnCommand(Stereo);

        remote.setCommand(KitchenOn);
        remote.buttonWasPressed();

        remote.setCommand(LivingRoomOn);
        remote.buttonWasPressed();

        remote.setCommand(DoorOpen);
        remote.buttonWasPressed();

        remote.setCommand(FanHigh);
        remote.buttonWasPressed();

        remote.setCommand(StereoOn);
        remote.buttonWasPressed();
    }
}
