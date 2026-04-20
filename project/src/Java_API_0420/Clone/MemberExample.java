package Java_API_0420.Clone;

public class MemberExample {
    public static void main(String[] args) {
        //원본 객체
        Member original = new Member("blue", "홍길동", "12345", 25, true);

        // 객체 복사 후 패스워드 변경
        Member cloned = original.getMember();
        cloned.password = "67890";

        System.out.println("복제 객체의 필드값");
        System.out.println("ID: "+cloned.id);
        System.out.println("이름: "+cloned.name);
        System.out.println("패스워드: "+cloned.password);
        System.out.println("나이: "+cloned.age);
        System.out.println("성인여부: "+cloned.adult);

        System.out.println();

        System.out.println("원본 객체의 필드값");
        System.out.println("ID: "+original.id);
        System.out.println("이름: "+original.name);
        System.out.println("패스워드: "+original.password);
        System.out.println("나이: "+original.age);
        System.out.println("성인여부: "+original.adult);
    }
}
