package Java_Class_0415;

public class PersonExample { //final 필드 선언과 초기화
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa"; final로 인하여 변경 불가
        //p1.ssn="654321-7654321"; 상동
        p1.name = "을지문덕";

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);
    }
}
