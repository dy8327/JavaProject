package Java_Class_0415;

public class Calculator1 { //메서드 호출방법&메서드 오버로딩
     //필드
     //생성자
     //메소드
     int plus(int x, int y){
        int result = x+y;
        return result;
     }

     double plus(double x, int y){ //메소드 오버로딩(하나의 메소드이름으로 여러가지 사용할때)
        double result = x+y;
        return result;
     }

    double plus(double x, double y){
        double result = x+y;
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

