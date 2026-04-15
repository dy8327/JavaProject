package Java_Class_0415;

public class Calculator2Example { //정적멤버 사용
    public static void main(String[] args) {
        double result1 = 10*10*Calculator2.pi; 
        int result2 = Calculator2.plus(10, 5); //정적멤버 호출
        int result3 = Calculator2.minus(10,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
