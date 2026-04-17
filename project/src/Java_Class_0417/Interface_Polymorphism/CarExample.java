package Java_Class_0417.Interface_Polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();
        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRighTire = new KumhoTire();

        myCar.run();
    }
}
