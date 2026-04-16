package Java_Class_0416;

public class CarSpExample {
    public static void main(String[] args) {
        CarSp myCarSp = new CarSp();
        
        myCarSp.setSpeed(-50);
        System.out.println("현재속도 : "+myCarSp.getSpeed());

        myCarSp.setSpeed(60);
        System.out.println("현재속도 : "+myCarSp.getSpeed());

        if(!myCarSp.isStop()){
            myCarSp.setStop(true);
        }
        System.out.println("현재속도: "+myCarSp.getSpeed());

    }
   


}
