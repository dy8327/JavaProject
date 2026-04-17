package Java_Class_0416;

public class Java_test_0416 {
    public static void main(String[] args) {

        // 점수 입력
        int i = 0;
        double[] scores = { 87, 90, 75, 93, 85, 72, 100, 65, 74, 62 };
        for (i = 0; i < 10; i++) {
            System.out.println(i + 1 + "번 학생 점수: " + scores[i] + "점");
        }

        // 점수 합계 및 평균
        int sum = 0;
        for (i = 0; i < 10; i++) {
            sum += scores[i];
        }
        System.out.println("---------------");
        System.out.println("총점: " + sum + "점");
        double avg = sum / 10;
        System.out.println("평균: " + avg + "점");
        System.out.println("---------------");

        // 최대값 탐색
        double max = scores[0];
        /*for (i = 1; i < 10; i++) {
            if (max > scores[i]) {
                continue;
            } else {
                max = scores[i];
            }
        }*/
        for (i = 1; i < 10; i++) {
            if (max < scores[i]) { //코드 수정완료
                max = scores[i];
            } 
        }
        System.out.println("최고점수는 " + max + "점 입니다.");
    }
}