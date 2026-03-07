public class Day1_1 {
    public static void main(String[] args) {

        String name = "수현";
        int age = 22;
        double height = 169.5;

        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
        System.out.printf("키: %.1f\n", height);

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);

        System.out.println(String.format("이름: %s", name));
        System.out.println(String.format("나이: %d", age));
        System.out.println(String.format("키: %.1f", height));


    }
}
