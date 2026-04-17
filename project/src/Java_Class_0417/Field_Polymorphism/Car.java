package Java_Class_0417.Field_Polymorphism;

public class Car {
    //필드
    Tire frontLeftTire = new Tire("앞왼쪽",6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire rearLeftTire = new Tire("뒤왼쪽", 3);
    Tire rearRighTire = new Tire("뒤오른쪽", 4);

    //생성자

    //메소드
    int run(){
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false){stop();return 1;};
        if(frontRightTire.roll()==false){stop();return 2;};
        if(rearLeftTire.roll()==false){stop();return 3;};
        if(rearRighTire.roll()==false){stop();return 4;};
        return 0; //스위치문이 정상작동되게 하는 코드. 없으면 작동안함.!!
    }
    void stop(){
        System.out.println("[자동차가 멈춥니다.]");
    }

}
