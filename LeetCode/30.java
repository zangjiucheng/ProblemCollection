import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList();
        HashMap<String, Integer> remaining = new HashMap<>(words.length);
        int substringSize = 0;
        int wordLength = words[0].length();

        for (String word : words) {
            remaining.put(word, remaining.getOrDefault(word, 0) + 1);
            substringSize += word.length();
        }

        for (int i = 0; i < s.length() - substringSize + 1; i++) {
            boolean flag = true;
            HashMap<String, Integer> remainningTemp = new HashMap<>(remaining);
            String temp = s.substring(i, i + substringSize);
            for (int j = 0; j < temp.length(); j += wordLength) {
                String compareTemp = temp.substring(j, j + wordLength);
                if (remainningTemp.keySet().contains(compareTemp)) {
                    if (remainningTemp.get(compareTemp) != 0) {
                        remainningTemp.put(compareTemp, remainningTemp.get(compareTemp) - 1);
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer.add(i);
            }
        }
        return answer;
    }

}