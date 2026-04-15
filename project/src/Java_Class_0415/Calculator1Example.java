package Java_Class_0415;

public class Calculator1Example {
    public static void main(String[] args) {
        Calculator1 myCal1 = new Calculator1();
        
        int result1 = myCal1.plus(5, 6); //메서드 오버로딩
        System.out.println("합: "+result1);

        double result2 = myCal1.plus(5.0, 6); //메서드 오버로딩
        System.out.println("합: "+result2);

        double result3 = myCal1.plus(5.0, 6.5); //메서드 오버로딩
        System.out.println("합: "+result3);

        myCal1.execute();
    }
}
