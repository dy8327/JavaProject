package Lib_Project_0421;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book implements Manageable {
    // 필드
    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            return;
        } else {
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void addItem() {
        Scanner scin = new Scanner(System.in);
        System.out.println("[도서 등록]");
        System.out.print("도서 ID: ");
        this.id = scin.nextInt();
        System.out.print("제목: ");
        this.title = scin.next();
        System.out.print("저자: ");
        this.author = scin.next();
        // System.out.println("아래와 같이 입력이 완료되었습니다.");

        String[] bookInfo = new String[3];
        bookInfo[0] = String.valueOf(id);
        bookInfo[1] = title;
        bookInfo[2] = author;

        byte[] bytesti = title.getBytes();
        byte[] bytesau = title.getBytes();
    FileOutputStream fos;
        try {
            fos = new FileOutputStream("C:/JavaProject/project/src/Lib_Project_0421/Book.txt");
            //fos.write(id+","+title+","+author);
            fos.write(id);
            //fos.write(bytesti);
            //fos.write(bytesau);

           // fos.write(author);
        } catch (IOException e) {
            System.out.print(e);
        }
      
      
        System.out.println("**********");
    }

    public void displayAll() {

    }

    @Override
    public void saveToFile() {
        FileWriter fos = null;
        try {
            fos = new FileWriter("C:/JavaProject/project/src/Lib_Project_0421/Book.txt");
            fos.write(id);
            fos.write(title);
            fos.write(author);
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    public void loadFromFile(){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:/JavaProject/project/src/Lib_Project_0421/Book.txt")));
            int x=0;
            while ((x=reader.read())!=-1) {
                System.out.print((char)x);
                
            }System.out.println();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
