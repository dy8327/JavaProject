package Java_Class_0416.Computer;

public class Computer extends Calculator{
    @Override //오버라이딩 명령어
    double areaCircle(double r){ //부모의 형식과 같아야 한다.
        System.out.println("Computer 객체의 areaCircle()실행");
        return Math.PI *r*r;
    }
}
