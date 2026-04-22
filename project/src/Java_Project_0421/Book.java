package Java_Project_0421;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;

public class Book implements Manageable{
    
    private String id;
    private String title;
    private String author;
 //  public String getBookid;
   // void setBook(int bookid, String title, String author){this.bookid=bookid; this.title=title; this.author=author;}
   // int getBookid(){ return bookid;}

    @Override
    public void addItem(){
        Scanner scin = new Scanner(System.in);
        System.out.println("[도서 등록]");
        System.out.print("도서 ID: ");
        this.id = scin.next();
        System.out.print("제목: ");
        this.title = scin.next();
        System.out.print("저자: ");
        this.author = scin.next();
        
        System.out.println("위와 같이 입력이 완료되었습니다.");
        
        

    }

    @Override
    public void displayAll() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:/JavaProject/project/src/Java_Project_0421/Book.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                for (String value : values)
                    System.out.println(value + "|");
            }
            reader.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveToFile() {
        FileWriter fos;
        File file;
        try {
            file = new File("C:/JavaProject/project/src/Java_Project_0421/Book.txt");
            fos = new FileWriter(file, true);
            fos.write(this.id + ",");
            fos.write(this.title + ",");
            fos.write(this.author + "\n");
            fos.flush();
            fos.close();
            System.out.println("저장 되었습니다.");
        } catch (IOException e) {
            System.out.print(e);
        }
        
    }

    @Override
    public void loadFromFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:/JavaProject/project/src/Java_Project_0421/Book.txt"));
           // int x = 0;
           // while ((x = reader.read()) != -1) {
                //System.out.print((char) x);
         //   }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
   

    
}
