package Java_Project_0421;

import java.util.Scanner;

public class AddItem implements Manageable{
    private int bookid;
    private String title;
    private String author;

    @Override
    void addItem(){
        Scanner scin = new Scanner(System.in);
        System.out.println("[도서 등록]");
        System.out.print("도서 ID: ");
        int bookid = scin.nextInt();
        System.out.print("제목: ");
        String title = scin.next();
        System.out.print("저자: ");
        String author = scin.next();

        
    }
    
}
