package Java_Class_0416.SuperSonicAirPlane;

public class SuperSonicAirPlane extends AirPlane{
    public static final int NORMAL =1;
    public static final int SUPERSONIC =2;

    public int flyMode = NORMAL;

    @Override //오버라이딩
    public void fly(){
        if(flyMode==SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else{
            super.fly(); //상위객체 호출
        }
    }
    
}
