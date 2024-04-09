package Q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();
        scanner.nextLine();
        String[][] sameGroup = new String[n][2];
        for (int x = 0; x < n; x++) {
            sameGroup[x] = scanner.nextLine().split(" ");
        }
        n = scanner.nextInt();
        scanner.nextLine();
        String[][] differentGroup = new String[n][2];
        for (int x = 0; x < n; x++) {
            differentGroup[x] = scanner.nextLine().split(" ");
        }
        n = scanner.nextInt();
        scanner.nextLine();
        String[][] currentGroup = new String[n][3];
        for (int x = 0; x < n; x++) {
            currentGroup[x] = scanner.nextLine().split(" ");
        }

        for (String same[] : sameGroup) {
            for (String current[] : currentGroup) {
                for (String c : current) {
                    if (same[0].equals(c)) {
                        break;
                    }
                    System.out.println("Same");
                }
            }

        }
    }
}