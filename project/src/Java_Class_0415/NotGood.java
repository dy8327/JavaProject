package Java_Class_0415;

public class NotGood {
    int speed;

    void run(){
        System.out.println(speed+"으로 달립니다.");
    }
//static 과 인스턴스를 하나에 사용하는 것은 권장하지 않는다.
//이 파일과 같은 형식으로 작업하지 말것!
    public static void main(String[] args) {
        NotGood notCar = new NotGood();
        notCar.speed =60;
        notCar.run();
    }
} 
