import java.util.HashSet;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        String[] splitWord = s.split("");
        int maxLength = 0;
        for (int i = 0; i < splitWord.length; i++) {
            int tempLength = 0;
            HashSet<String> wordsHash = new HashSet<>();
            for (int j = i; j < splitWord.length; j++) {
                String Word = splitWord[j];
                if (!wordsHash.contains(Word)) {
                    wordsHash.add(Word);
                    tempLength++;
                } else {
                    break;
                }
            }
            maxLength = tempLength < maxLength ? maxLength : tempLength;
        }

        return maxLength;
    }
}