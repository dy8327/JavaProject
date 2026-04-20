package Java_API_0420.DeepClone;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("홍길동", 25, new int[]{70,70}, new Car("소나타"));

        Member cloned = original.getMember();
        cloned.scores[0]=100;
        cloned.car.model ="그랜져";

        System.out.println("복제 객체의 필드값");
        System.out.println("이름: "+cloned.name);
        System.out.println("나이: "+cloned.age);
        System.out.print("점수: ");
        for(int i=0; i<cloned.scores.length;i++){
            System.out.print(cloned.scores[i]);
            System.out.print((i==(cloned.scores.length-1))?"":",");
        }
        System.out.println();
        System.out.println("모델명: "+cloned.car.model);

        System.out.println();
        System.out.println("복제 객체의 필드값");
        System.out.println("이름: "+original.name);
        System.out.println("나이: "+original.age);
        System.out.print("점수: ");
        for(int i=0; i<original.scores.length;i++){
            System.out.print(original.scores[i]);
            System.out.print((i==(original.scores.length-1))?"":",");
        }
        System.out.println();
        System.out.println("모델명: "+original.car.model);
    }
}
