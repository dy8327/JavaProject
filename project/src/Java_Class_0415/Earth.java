package Java_Class_0415;

public class Earth { //상수=정적final필드
    static final double EARTH_RADIUS = 6400; //상수이름은 전부 대문자
    static final double EARTH_SURFACE_AREA;

    static{
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
