import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> ewords = new ArrayList<>();
        
        ewords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            if (ewords.contains(words[i])) {
                return new int[]{(i%n) + 1, (i/n) + 1};
            } else {
                ewords.add(words[i]);
            }
            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                return new int[]{(i%n) + 1, (i/n) + 1};
            }
        }
        
        return new int[]{0,0};
    }
}