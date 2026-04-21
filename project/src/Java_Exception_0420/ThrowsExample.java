package Java_Exception_0420;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            findClass();
        } catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
    public static void findClass() throws ClassNotFoundException{
       // Class clazz = Class.forName("java.lang.String2"); 예외처리 오류때문에 주석처리해버림
       
    }
}
