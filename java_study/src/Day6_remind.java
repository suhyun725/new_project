import java.util.Scanner;
import java.util.ArrayList;

public class Day6_remind {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int total = 0;

        while (true) {
            System.out.print("숫자 입력 (0 입력시 종료): ");
            num = sc.nextInt();

            if (num == 0) break;

            nums.add(num);
            total += num;

        }

        if (nums.isEmpty()) {
            System.out.println("입력된 숫자가 없습니다!");
        }
        else {
            System.out.printf("총합: %d", total);
            System.out.printf("평균: %.2f", (double) total / nums.size());

        }
    }
}
