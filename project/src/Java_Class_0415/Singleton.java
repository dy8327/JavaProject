package Java_Class_0415;

public class Singleton { //싱글톤(외부에서 확인불가)
    private static Singleton singleton = new Singleton(); //같은 내부이기에 new사용 가능

    private Singleton(){}

    static Singleton getInstance(){
        return singleton;
    }
}
