public class Day8_1_car {
    String brand;
    String color;
    int speed;

    public Day8_1_car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void print() {
        System.out.printf("브랜드: %s%n", brand);
        System.out.printf("색상: %s%n", color);
        System.out.printf("속도: %dkm/h%n", speed);
    }
}
