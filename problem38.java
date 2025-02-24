
//

import java.util.Scanner;

public class problem38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 가로
        int b = scanner.nextInt(); // 세로

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close();
    }

}