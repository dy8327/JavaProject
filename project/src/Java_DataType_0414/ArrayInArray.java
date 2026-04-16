package Java_DataType_0414;

public class ArrayInArray {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for(int i=0; i<mathScores.length;i++){
            for(int k=0; k<mathScores[i].length;k++){
                System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
            }
        }
        System.out.println();

        int[][] engScores = new int[2][];
        engScores[0] = new int[2]; //engScores의 0인덱스는 2열을 가진다.
        engScores[1] = new int[3]; //engScores의 1인덱스는 3열을 가진다.
        for(int i=0; i<engScores.length;i++){
            for(int k=0; k<engScores[i].length;k++){
                System.out.println("engScore["+i+"]["+k+"]="+engScores[i][k]);
            }
        }
        System.out.println();

        int[][] javaScores={{95,80},{92,96,80}};
        for(int i=0;i<javaScores.length;i++){
            for(int k=0;k<javaScores[i].length;k++){
                System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
            }
        }

    }
}
