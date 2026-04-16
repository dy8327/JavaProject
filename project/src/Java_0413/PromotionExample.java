package Java_0413;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 형변환
        byte byteValue =10;
        int intValue = byteValue;
        System.out.println("intValue: "+intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: "+intValue);

        intValue = 50;
        long longvalue = intValue;
        System.out.println("longValue: "+longvalue);

        longvalue = 100;
        float floatValue = longvalue;
        System.out.println("floatValue: "+floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: "+doubleValue);
    }
}
