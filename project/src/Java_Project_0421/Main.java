package Java_Project_0421;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Book book = new Book();
        Book book = new Book();
        
        //초기화면
        Scanner mainsc = new Scanner(System.in);
        System.out.println("===도서관 시스템===");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 목록 조회");
        System.out.println("3. 저장 및 종료");
        System.out.print("메뉴 선택 : ");
        int ms = mainsc.nextInt();
        if(ms==1){
        book.addItem();
        System.out.println("도서아이디는"+book.getBookid);
        System.out.print("성공적으로 등록되었습니다.");
        }


    }
}
