import java.util.Arrays;
class Solution {
    public boolean isPalindrome(int x) {
        String[] strList = String.valueOf(x).split("");
        String[] endList = new String[strList.length];
        for(int i=0; i<strList.length;i++){
            endList[endList.length-1-i] = strList[i];
        }
        return Arrays.equals(endList, strList);
    }
}