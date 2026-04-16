package Java_Class_0416.People;

public class Student extends People{
    public int StudentNo;

    public Student(String name, String ssn, int StudentNo){
        super(name, ssn); //부모생성자 호출(부모으 생성자가 없을땐 사용 금지), 자식생성자의 제일 첫줄에 작성!!
        this.StudentNo = StudentNo;
    }
}
