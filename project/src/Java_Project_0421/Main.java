package Java_Project_0421;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Book book = new Book();
        Book book = new Book(null, null, null);
        book.loadFromFile();
        try (//초기화면
        Scanner mainsc = new Scanner(System.in)) {
            while(true){
            System.out.println("===도서관 시스템===");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("3. 저장 및 종료");
            System.out.print("메뉴 선택 : ");
            int ms = mainsc.nextInt();
            if(ms==1){
            book.addItem();
            System.out.print("저장하시겠습니까?(y/n)");
            String ms1 = mainsc.next();
            switch(ms1){
             case "y", "Y":
             book.saveToFile();
             continue;
             case "n", "N":
             System.out.println("저장을 취소하였습니다.");}
            }else if(ms==2){
                book.displayAll();
            }else if(ms==3){
                break;
            }

   }
        }
    }
}
