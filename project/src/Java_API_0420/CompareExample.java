package Java_API_0420;
import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Student s3 = new Student(2);

        int result = Objects.compare(s1, s2, new StudentCompare());
        if(result==-1){
            System.out.println("s1이 s2보다 작습니다.");
        }else if(result == 0){
            System.out.println("s1과 s2가 같습니다.");
        } else System.out.println("s1이 s2보다 큽니다.");

        result = Objects.compare(s1, s3, new StudentCompare());
        if(result==-1){
            System.out.println("s1이 s3보다 작습니다.");
        }else if(result == 0){
            System.out.println("s1과 s3가 같습니다.");
        } else System.out.println("s1이 s3보다 큽니다.");
    }
    static class Student{
        int sno;
        Student(int sno){
            this.sno =sno;
        }
    }

    static class StudentCompare implements Comparator<Student>{
        @Override
        public int compare(Student a, Student b){
        /*if(a.sno<b.sno) return -1; 
        else if(a.sno==b.sno) return 0;
        else return 1;*/ //compare의 기준식. 이것을 사용하는 것을 권장.

        return Integer.compare(a.sno, b.sno);
    }
}
}
