public class Day3_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) { //continue를 이용해서도 가능
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
