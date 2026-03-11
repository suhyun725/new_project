import java.util.Scanner;
import java.util.ArrayList;

public class Day7_3 {

    public static int getTotal(ArrayList<Integer> list) {
        int total = 0;
        for (int num : list){
            total += num;
        }
        return total;
    }
    public static double getAvg(ArrayList<Integer> list) {
        return  (double)getTotal(list)/list.size();
    }
    public static int getMax(ArrayList<Integer> list) {
        int max = 0;
        for (int num : list){
            if (num > max) max = num;
        }
        return max;
    }
    public static int getMin(ArrayList<Integer> list) {
        int min = 100;
        for (int num : list){
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        System.out.print("과목 수를 알려주세요: ");
        int sub_num = sc.nextInt();

        for (int i = 0; i < sub_num; i++) {
            System.out.printf("%d번 점수: ", i+1);
            int score = sc.nextInt();

            scores.add(score);


        }

        System.out.printf("총합: %d%n", getTotal(scores));
        System.out.printf("평균: %.2f%n", getAvg(scores));
        System.out.printf("최고점: %d%n", getMax(scores));
        System.out.printf("최저점: %d%n", getMin(scores));

    }
}
