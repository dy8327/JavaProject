package Java_Class_0417.Field_Polymorphism;

public class HankookTire extends Tire{
    //생성자
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation); //상위 생성자 호출
    }
    //메소드
    @Override
    public boolean roll(){
        ++nowRotation;
        if(nowRotation<maxRotation){
            System.out.println(location+"HankookTire 수명 : "+(maxRotation-nowRotation)+"회");
            return true;
        }else{
            System.out.println("***"+location+"HankookTire 펑크");
            return false;
        }
    }
}