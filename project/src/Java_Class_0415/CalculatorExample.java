package Java_Class_0415;

public class CalculatorExample { //메소드 선언
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.powerOn();

        int result1 = myCal.plus(5, 6);
        System.out.println("합: "+result1);

        byte x=10; //묵시적 형변환 
        byte y=4;
        double result2 = myCal.divide(x, y);
        System.out.println("결과: "+result2);

        myCal.powerOff();
    }
}
