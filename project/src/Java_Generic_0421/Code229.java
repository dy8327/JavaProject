package Java_Generic_0421;

class Data<T> {
    T obj;
    Data(T ob){ //Data<T>(T ob) 이게 원래 코드인데 <T>가 자동으로 들어가서 안쓰는거다.
        obj = ob;
    }
    T getObj(){
        return obj;
    }
    void showType(){
        System.out.println("Type of T: "+obj.getClass().getName());
    }
}



public class Code229 {
    public static void main(String[] args) {
        Data<Integer> d1 = new Data<Integer>(100);
        System.out.println(d1.getObj());
        d1.showType();

        Data<String> d2 = new Data<String>("JAVA");
        System.out.println(d2.getObj());
        d2.showType();
    }
}

