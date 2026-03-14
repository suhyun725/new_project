public class Day8_2_car {
    String brand;
    String color;
    int speed;

    public Day8_2_car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void accelerate() {
        System.out.println("가속합니다!");
        speed = speed + 20;
        System.out.printf("속도: %dkm/h%n", speed);
        System.out.println();
    }

    public void decelerate() {
        System.out.println("감속합니다!");
        speed = speed - 20;
        System.out.printf("속도: %dkm/h%n", speed);
        System.out.println();
    }

    public void print() {
        System.out.printf("브랜드: %s%n", brand);
        System.out.printf("색상: %s%n", color);
        System.out.printf("속도: %dkm/h%n", speed);
        System.out.println();
    }
}
