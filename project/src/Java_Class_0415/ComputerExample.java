package Java_Class_0415;

public class ComputerExample {
    public static void main(String[] args) { //레퍼런스 전달방식
        Computer myCom = new Computer();
        
        int[] values1 = {1,2,3};
        int result1=myCom.sum1(values1);
        System.out.println("result1: "+result1);

        // int result2=myCom.sum1(new int[]{1,2,3,4,5}); 
        //익명배열 만들어 전달하는 방식은 사용하지 않는 것이 좋다.
        //아래 코드처럼 레퍼런스 전달 방식을 사용하자.

        int[] values2 = new int[]{1,2,3,4,5};
        int result2=myCom.sum1(values2);
        System.out.println("result2: "+result2);
        }
}
