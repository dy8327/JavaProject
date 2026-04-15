package Java_Class_0415;

public class Computer {
    int sum1(int[] values){
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return sum;
    }
} //매개변수 선언 - 레퍼런스 전달방식
