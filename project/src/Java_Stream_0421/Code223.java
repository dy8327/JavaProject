package Java_Stream_0421;

import java.io.FileOutputStream;
import java.io.IOException;

public class Code223 {
    public static void main(String[] args) {
        String content = "Hi Java World";
        byte[] bytes = content.getBytes();
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("data2.txt"); 
          //  fos = new FileOutputStream("c:/JavaProject/project/src/Java_Stream_0421/data2.txt"); 
            fos.write(bytes);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                fos.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
}
