import java.util.Scanner;

public class Day5_remind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int[] more = new int[5];
        int sum = 0;
        double avg = 0;


        for (int i = 0; i <5; i++) {
            System.out.printf("%d번째 숫자: ", i+1);
            nums[i] = sc.nextInt();

            sum += nums[i];
            avg = (double) sum /(i+1);
        }

            System.out.printf("평균: %.2f%n", avg);
            System.out.print("평균보다 큰 숫자: ");

        for (int i = 0; i < more.length; i++) {
            if (nums[i] > avg) {
                System.out.printf("%d ", nums[i]);
            }
        }



    }
}
