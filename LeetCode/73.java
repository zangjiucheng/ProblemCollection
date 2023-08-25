import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> iList = new ArrayList<>();
        ArrayList<Integer> jList = new ArrayList<>();
        int sizey = matrix.length;
        int sizex = matrix[0].length;
        for (int i = 0; i < sizey; i++) {
            for (int j = 0; j < sizex; j++) {
                if (matrix[i][j] == 0) {
                    if (!iList.contains(i)) {
                        iList.add(i);
                    }
                    // System.out.println(i);
                    if (!jList.contains(j)) {

                        jList.add(j);
                    }
                }

            }
        }
        for (int i = 0; i < sizey; i++) {
            if (iList.contains(i)) {
                Arrays.fill(matrix[i], 0, sizex, 0);
            }
            for (int j = 0; j < sizex; j++) {
                if (jList.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}