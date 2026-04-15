package Java_Class_0415;

public class Person { //final필드 선언과 초기화
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name){
        this.ssn =ssn; //값 대입 후 변경 불가.
        this.name = name;
    }
}
