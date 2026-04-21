package Lib_Project_0421;

import java.util.Scanner;

public class BookExample {
    public static void main(String[] args) {
        Book book = new Book();

        //초기화면
        Scanner mainsc = new Scanner(System.in);
        while(true){
        System.out.println("===도서관 시스템===");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 목록 조회");
        System.out.println("3. 저장 및 종료");
        System.out.print("메뉴 선택 : ");
        int ms = mainsc.nextInt();
        if(ms==1){
        book.addItem();
        } else if(ms==2){
            book.loadFromFile();
        } else if(ms==3){
            book.saveToFile();
            break;
        }
    }
    }

}
