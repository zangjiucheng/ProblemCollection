import java.util.HashMap;

public class Solve {

    public static void main(String[] args) {
        int num = 3994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        String result = "";
        HashMap<Integer, Character> Roman = new HashMap<>();
        Roman.put(1, 'I');
        Roman.put(5, 'V');
        Roman.put(10, 'X');
        Roman.put(50, 'L');
        Roman.put(100, 'C');
        Roman.put(500, 'D');

        int n = num / 1000;
        result += "M".repeat(n);
        num %= 1000;
        for (int key : Roman.keySet()) {
            System.out.println(key);
        }

        n = num / 100;
        if (n < 4) {
            result += "C".repeat(n);
        } else if (n == 4) {
            result += "CD";
        } else if (n == 9) {
            result += "CM";
        } else {
            result += "D" + "C".repeat(n - 5);
        }
        System.out.println(n);

        return result;
    }

}
