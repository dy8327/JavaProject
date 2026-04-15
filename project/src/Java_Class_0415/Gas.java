package Java_Class_0415;

public class Gas { //return문 연습
    //필드
    int gas;
    //생성자
    //메소드
    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(gas==0){
            System.out.println("가스가 없습니다.");
            return false; //가스가 없을때 종료하며 false값을 전달한다.
        }
        System.out.println("가스가 있습니다.");
        return true; //가스가 있을때 종료하며 true값을 전달한다.
    }

    void run(){
        while(true){
            if(gas>0){
                System.out.println("달립니다.(가스잔량"+gas+")");
                gas -=1; //while문에 의해 0이 될때까지 반복.
            }else{
                System.out.println("멈춥니다.(가스잔량"+gas+")");
                return;
            }
        }
    }
}
