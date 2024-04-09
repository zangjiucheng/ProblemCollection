class Solution {
    public boolean checkOnesSegment(String s) {
        String[] pieces = s.split("");
        boolean flag = false;
        for (int i = 1; i < pieces.length; i++) {
            if (flag && (pieces[i].charAt(0) == '1')) {
                return false;
            }
            if (pieces[i].charAt(0) == '0') {
                flag = true;
            }
        }
        return true;

    }
}