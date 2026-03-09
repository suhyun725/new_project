import java.util.Scanner;
import java.util.ArrayList;


public class Day5_2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 (0입력시 종료): ");
            num = sc.nextInt();

            if(num != 0) nums.add(num);
            else break;

            if (num % 2 == 0) evens.add(num);
        }

        System.out.print("짝수: ");

        for (int even : evens) {
            System.out.printf("%d ", even);
        }





    }
}
