package Java_Class_0415;

public class Car3 {
     // 필드
     String company = "현대자동차";
     String model;
     String color;
     int maxSpeed;
 
     // 생성자
     Car3() {
 
     }
     Car3(String model){
         this(model,null,0);
     }
     Car3(String model, String color){
         this(model,color,0);
         
     }
     Car3(String model, String color,int maxSpeed){
         this.model=model;
         this.color=color;
         this.maxSpeed=maxSpeed;
     }
}//다른생성자 호출하여 중복코드 줄이기
