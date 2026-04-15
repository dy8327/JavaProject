package Java_Class_0415;

public class GasExample { //return문 연습
    public static void main(String[] args) {
        Gas myGas = new Gas();

        myGas.setGas(5);

        boolean gasState = myGas.isLeftGas();
        if(gasState){
            System.out.println("출발합니다.");
            myGas.run();
        }

        if(myGas.isLeftGas()){
            System.out.println("가스를 주입할 필요가 없습니다.");
        }else{
            System.out.println("가스를 주입하세요.");
        }
    }
}
