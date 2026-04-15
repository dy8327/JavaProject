package Java_Class_0415;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1=new Korean("박자바","011111-1234567");
        System.out.println("k1.nation: "+k1.nation);
        System.out.println("k1.name: "+k1.name);    
        System.out.println("k1.ssn: "+k1.ssn);
        System.out.println(k1);

        Korean k2=new Korean("김자바","811111-1234567");
        System.out.println("k2.name: "+k2.name);    
        System.out.println("k2.ssn: "+k2.ssn);
        System.out.println(k2);
    }
    
    
}//생성자에서 필드 초기화
