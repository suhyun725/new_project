import java.util.Scanner;

public class Day4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int maxidx = 0;
        int minidx = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d번쨰 숫자: ", i+1);
            nums[i] = sc.nextInt();

            if (nums[i] > nums[maxidx]) maxidx = i;
            if (nums[i] < nums[minidx]) minidx = i;
        }

        System.out.printf("최댓값: %d (%d번째)%n", nums[maxidx], maxidx+1);
        System.out.printf("최솟값: %d (%d번째)%n", nums[minidx], minidx+1);
    }
}
