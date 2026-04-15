package Java_DataType_0414;

public class ArrayCreateByValueList2 {
    public static void main(String[] args) { //값의 리스트로 배열생성
        int[] scores;
        scores = new int[]{83,90,87};
        int sum1 = 0;
        for(int i=0;i<3;i++){
            sum1 += scores[i];
        }
        System.out.println("총합: "+sum1);

        int sum2 = add(new int[]{83,90,87});//이건 여기서만 사용 가능
        System.out.println("총합: "+sum2);
        System.out.println();
    }

    public static int add(int[] scores){
        int sum = 0;
        for(int i=0; i<3; i++){
            sum += scores[i];
        }
        return sum;
    }
}
