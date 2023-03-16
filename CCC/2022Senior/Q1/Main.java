package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        while (x > 0) {
            if (x % 4 == 0) {
                count++;
            }
            x -= 5;
        }
        if (x % 5 == 0) {
            count++;
        }
        System.out.println(count);
    }
}