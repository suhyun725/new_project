public class Day7_4 {

    public static void print(int a) {
        System.out.printf("정수: %d%n", a);
    }

    public static void print(double a) {
        System.out.printf("실수: %f%n", a);
    }

    public static void print(String a) {
        System.out.printf("문자열: %s%n", a);
    }


    public static void main(String[] args) {
        print(10);
        print(3.14);
        print("안녕하세요");
    }



}
