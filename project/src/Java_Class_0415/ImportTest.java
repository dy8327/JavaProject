package Java_Class_0415;
import java.text.SimpleDateFormat;
import java.util.*;
public class ImportTest { //import예제. text와util class 가져와 사용하기
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");

        System.out.println("오늘은 "+date.format(today)+" 입니다.");
        System.out.println("현재시간은 "+time.format(today)+" 입니다.");
    }
    
}
