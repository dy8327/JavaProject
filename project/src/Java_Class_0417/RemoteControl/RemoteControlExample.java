package Java_Class_0417.RemoteControl;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        RemoteControl.ChangeBattery();
    }
}
