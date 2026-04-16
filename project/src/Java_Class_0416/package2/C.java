package Java_Class_0416.package2;
import Java_Class_0416.package1.A;
public class C {
    public C(){
        A a=new A();
        a.field1=1;
        //a.field2=1; A클래스에 defult로 정의되서 사용불가
        //a.field3=1; A클래스에서 프라이빗 되어 사용 불가

        a.method1();
        //a.method2(); A클래스에 defult로 정의되서 사용불가
        //a.method3(); A클래스에서 프라이빗 되어 사용 불가
    }
    
}
