package Lib_Project_0421;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

public class Book implements Manageable {
    // 필드
    private String id;
    private String title;
    private String author;

    public Book() {
        this.id = id;
        this.title = title;
        this.author = author;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

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
        try
             (Scanner scin = new Scanner(System.in)) {
            System.out.println("[도서 등록]");
            System.out.print("도서 ID: ");
            this.id = scin.next();
            System.out.print("제목: ");
            this.title = scin.next();
            System.out.print("저자: ");
            this.author = scin.next();
             System.out.println("아래와 같이 입력이 완료되었습니다.");
             //scin.close();
        }
        //System.out.println();
        }  
        


    public void displayAll() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:/JavaProject/project/src/Lib_Project_0421/Book.txt"));
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
            file = new File("C:/JavaProject/project/src/Lib_Project_0421/Book.txt");
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
            reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:/JavaProject/project/src/Lib_Project_0421/Book.txt")));
            int x = 0;
            while ((x = reader.read()) != -1) {
                System.out.print((char) x);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
