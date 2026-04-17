package Java_Class_0417.AbstractClass;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");
        
        //변수의 자동 타입 변환
        Animal animal = null; //추상클래스는 new로 객체생성 불가
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");
        
        //매개변수의 자동 타입변환
        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
