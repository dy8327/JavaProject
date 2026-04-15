package Java_Class_0415;

public class Television { //정적멤버 블럭 초기화
    static String company = "삼성";
    static String model = "LCD";
    static String info;

    static{
        info = company +"-"+model; //블러 초기화
    }
}
