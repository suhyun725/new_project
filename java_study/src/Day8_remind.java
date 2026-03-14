import java.util.Scanner;
import java.util.ArrayList;

public class Day8_remind {


    public static ArrayList<Integer> calc_even(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) evens.add(num);
        }
        return evens;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d번째 숫자: ", i+1);
            int num = sc.nextInt();

            nums.add(num);
        }

        System.out.println("짝수: " + calc_even(nums));


     }
}
