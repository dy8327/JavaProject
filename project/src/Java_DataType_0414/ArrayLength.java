package Java_DataType_0414;

public class ArrayLength { //배열의 length를 이용한 for문 활용
    public static void main(String[] args) {
        int[] scores = {83,90,87};

        int sum = 0;
        for(int i=0; i<scores.length;i++){
            sum += scores[i];
        }
        System.out.println("총합: "+sum);

        double avg=(double) sum/scores.length;
        System.out.println("평균: "+avg);
    }
}
