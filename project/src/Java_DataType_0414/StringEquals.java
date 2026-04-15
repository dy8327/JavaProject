package Java_DataType_0414;

public class StringEquals {
    public static void main(String[] args) {
        String strVal1="류도영";
        String strVal2="류도영";

        if(strVal1==strVal2){
            System.out.println("strVal1과 strVal2는 참조가 같음");
        }else{
            System.out.println("strVal1과 strVal2는 참조가 다름");
        }

        if(strVal1.equals(strVal2)){
            System.out.println("strVal1과strVal2는 문자열이 같음");
        }

        String strVal3 = new String("류도영");
        String strVal4 = new String("류도영");

        if(strVal3==strVal4){
            System.out.println("strVal1과 strVal2는 참조가 같음");
        }else{
            System.out.println("strVal1과 strVal2는 참조가 다름");
        }

        if(strVal3.equals(strVal4)){
            System.out.println("strVal1과strVal2는 문자열이 같음");
        }
    }
}
