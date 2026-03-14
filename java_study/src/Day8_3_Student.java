import java.util.ArrayList;

public class Day8_3_Student {
    String name;
    int score;

    public Day8_3_Student(String name, int score) {
       this.name = name;
       this.score =score;
    }

    public void print() {
        System.out.printf("%s: %d점%n", name, score);
    }
}
