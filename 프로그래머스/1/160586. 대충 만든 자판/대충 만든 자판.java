import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] minCount = new int[26];
        Arrays.fill(minCount, Integer.MAX_VALUE);
        
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int idx = c - 'A';
                minCount[idx] = Math.max(1, Math.min(minCount[idx], i + 1));
            }
        }
        
        int len = targets.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            String s = targets[i];
            int count = 0;
            boolean possible = true;
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int idx = c - 'A';
                
                if (idx < 0 || idx >= 26 || minCount[idx] == Integer.MAX_VALUE) {
                    possible = false;
                    break;
                }
                
                count += minCount[idx];
            }
            
            answer[i] = possible ? count : -1;
        }
        
        return answer;
    }
}