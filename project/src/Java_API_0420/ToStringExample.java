package Java_API_0420;
import java.util.Objects;

public class ToStringExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2)); //Objects.toString는 입력이 문자열이 아닌 null어도 null을 출력한다.
        System.out.println(Objects.toString(str2, "이름이 없습니다.")); //null이 입력되면 뒤의 이름없음이 출력되도록 할 수 있다.
    }
}
