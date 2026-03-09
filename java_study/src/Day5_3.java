import java.util.Scanner;
import java.util.ArrayList;

public class Day5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        String name = "";
        String search = "";

        while (true) {
            System.out.print("이름을 입력하세요 (q 입력시 종료): ");
            name = sc.nextLine();

            if (name.equals("q")) break;

            names.add(name);
        }

        while (true) {
            System.out.print("검색할 이름을 입력하세요 (q 입력시 종료): ");
            search = sc.nextLine();

            if (search.equals("q")) break;

            if (names.contains(search)) {
                System.out.printf("%s는 %d번째에 있습니다!%n", search, names.indexOf(search)+1);
            }
            else System.out.printf("%s은(는) 명단에 없습니다!%n", search);
        }


    }
}
