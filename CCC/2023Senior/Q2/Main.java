package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] outList = new int[n];
        outList[0] = 0;
        String[] inputList = sc.nextLine().split(" ");
        for (int length = 2; length <= n + 1; length++) {
            ArrayList<Integer> absValueList = new ArrayList<>();
            for (int start = 0; start <= n; start++) {
                int absValue = Integer.MIN_VALUE;
                if (start + length <= n) {
                    String[] checkList = Arrays.copyOfRange(inputList, start, start + length);
                    for (int x = 0; x <= (int) (length / 2); x++) {
                        if (absValue == Integer.MIN_VALUE) {
                            absValue = 0;
                        }
                        absValue += Math
                                .abs(Integer.parseInt(checkList[x]) - Integer.parseInt(checkList[length - x - 1]));
                        System.out.println(absValue);
                    }
                }
                if (absValue != Integer.MIN_VALUE) {
                    absValueList.add(absValue);
                }
            }
            // for (int x : absValueList) {
            // System.out.print(x + " ");
            // }
            try {
                outList[length - 1] = absValueList.stream().mapToInt(Integer::intValue).min().getAsInt();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        for (int x : outList) {
            System.out.print(x + " ");
        }
    }

}