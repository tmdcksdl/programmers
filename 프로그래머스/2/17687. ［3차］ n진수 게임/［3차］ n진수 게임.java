import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int i = 0;
        int j = 1;
        int cnt = 0;
        
        boolean end = false;
        
        while(!end) {
            String s = Integer.toString(i, n).toUpperCase();
            
            for (char c : s.toCharArray()) {
                if (j == m + 1) {
                    j = 1;
                }

                if (p == j) {
                    answer += String.valueOf(c);
                    cnt++;
                }
                
                if (cnt == t) {
                    end = true;
                    break;
                }
                j++;
            }
            i++;
        }
        
        return answer;
    }
}