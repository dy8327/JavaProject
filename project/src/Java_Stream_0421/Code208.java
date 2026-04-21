package Java_Stream_0421;

import java.util.Scanner;

public class Code208 {
    public static void main(String[] args) {
        try (Scanner scin = new Scanner(System.in)) {
            System.out.print("이름 : ");
            String name = scin.next();
            System.out.print("전화번호(-포함) : ");
            String phone = scin.next();
            System.out.print("나이 : ");
            int age = scin.nextInt();
            System.out.print("성별(m/f) : ");
            char gender = scin.next().charAt(0);

            System.out.println("이름 : "+name);
            System.out.println("전화번호 : "+phone);
            System.out.println("나이 : "+age+"살");
            if(gender == 'm')
            System.out.println("성별 : 남자");

            if(gender == 'f')
            System.out.println("성별 : 여자");
        }
    }
}
