package Java_Class_0416.package1;

public class A {
    //필드
    public int field1; //공용사용가능
    int field2; //기본은 defult이고 자식에게만 사용권한을 준다.
    private int field3; //현재 클래스 내에서만 사용가능

    //생성자
    public A(){
        field1 =1;
        field2 =1;
        field3 =1;

        method1();
        method2();
        method3();
    }
    public void method1(){}
    void method2(){}
    private void method3(){}
}
