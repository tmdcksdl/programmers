import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = String.valueOf(n).split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        String newstr = "";
        for (int i = 0; i < str.length; i++) {
            newstr += str[i];
        }
        
        answer = Long.parseLong(newstr);
        
        return answer;
    }
}