package Java_Class_0417.Interface_Parameter_Polymorphism;

public class InstanceofExample {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle; //버스클래스에 만들어진 버스만의 메소드를 실행하기 위해 형변환
            bus.checkFare();
        }
        vehicle.run();
    }
}
