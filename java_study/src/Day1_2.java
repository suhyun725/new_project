public class Day1_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.printf("a + b = %d%n", a+b);
        System.out.printf("a - b = %d%n", a-b);
        System.out.printf("a * b = %d%n", a*b);
        System.out.printf("a / b = %d%n", a/b);
        System.out.printf("a %% b = %d%n", a%b);

        System.out.println("\na + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        System.out.println(String.format("%na + b = %d", (a+b)));
        System.out.println(String.format("a - b = %d", (a-b)));
        System.out.println(String.format("a * b = %d", (a*b)));
        System.out.println(String.format("a / b = %d", (a/b)));
        System.out.println(String.format("a %% b = %d", (a%b)));




    }
}
