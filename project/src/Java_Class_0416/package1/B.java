package Java_Class_0416.package1;

public class B {
    public B(){
        A a=new A();
        a.field1 =1;
        a.field2 =1;
        //a.field3=1; A클래스에서 프라이빗 처리되어 사용 불가.

        a.method1();
        a.method2();
        //a.method3(); A클래스에서 프라이빗 처리되어 사용 불가.
    }
}
