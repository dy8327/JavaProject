package Java_API_0420;
import java.io.IOException;
public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력: "); 
        int readByteNo = System.in.read(bytes); //배열처리에서만 사용. 평소에는 scanner사용하기.

        String str = new String(bytes, 0, readByteNo-2);//입력 받은 마지막 값에는 null이 들어가기 때문에 2를 빼줘야한다.
        System.out.println(str);
    }
    
}
