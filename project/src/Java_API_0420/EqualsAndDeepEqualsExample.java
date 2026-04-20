package Java_API_0420;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
    public static void main(String[] args) {
        Integer o1 = 1000;
        Integer o2 = 1000;
        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.equals(o1, null));
        System.out.println(Objects.equals(null, o2));
        System.out.println(Objects.equals(null, null));
        System.out.println(Objects.deepEquals(o1, o2)+"\n");

        Integer[] arr1 = {1,2};
        Integer[] arr2 = {1,2};
        System.out.println(Objects.equals(arr1, arr2)); //어래이 주소를 저장하고 있는 객체의 주소가 다름
        System.out.println(Objects.deepEquals(arr1, arr2)); //어래이 주소를 저장하고 있는 객체의 내부에 가지고 있는 주소가 같음.
        System.out.println(Arrays.deepEquals(arr1, arr2));
        System.out.println(Objects.deepEquals(null, arr2));
        System.out.println(Objects.deepEquals(arr1, null));
        System.out.println(Objects.deepEquals(null,null));
}    
}
