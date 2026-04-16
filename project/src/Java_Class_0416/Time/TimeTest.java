package Java_Class_0416.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 32, 50);
        System.out.println(t);

        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}
