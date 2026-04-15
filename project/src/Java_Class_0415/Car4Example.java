package Java_Class_0415;

public class Car4Example { //인스턴스 멤버와this
    public static void main(String[] args) {
        Car4 myCar4 = new Car4("포르쉐");
        Car4 youCar4 = new Car4("벤츠");

        myCar4.run();
        youCar4.run();
    }
}
