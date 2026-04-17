package Java_Class_0417.Interface_Polymorphism;

public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRighTire = new HankookTire();
    Tire rearLeftTire = new HankookTire();
    Tire reatRighTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frontRighTire.roll();
        rearLeftTire.roll();
        reatRighTire.roll();
    }
}
