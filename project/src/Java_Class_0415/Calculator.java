package Java_Class_0415;

public class Calculator { //메소드 선언
    void powerOn(){
        System.out.println("파워온");
    }

    int plus(int x , int y){
        int result = x+y;
        return result; //결과값을 실행파일에 리턴
    }

    double divide(int x, int y){
        double result = (double)x/y;
        return result;
    }

    void powerOff(){
        System.out.println("파워오프");
    }
}
