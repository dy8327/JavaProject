package Java_Class_0415;

public class Calculator1 { //메서드 호출방법
     //필드
     //생성자
     //메소드
     int plus(int x, int y){
        int result = x+y;
        return result;
     }

     double avg(int x, int y){ 
        double sum=plus(x, y); //내부 메서드를 부를때는 별도의 주소는 필요없이 이름만 불러도 된다.
        double result = sum/2;
        return result;
     }
     void execute(){
        double result = avg(7,10);
        println("실행결과: "+result);
     }
     void println(String message){
        System.out.println(message);
     }
        
     }

