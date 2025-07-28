import java.util.*;

class Solution {
    public ArrayList<Long> solution(int n, long left, long right) {
        ArrayList<Long> answer = new ArrayList<>();
        
        for (long k = left; k <= right; k++) {
            long i = k / n;
            long j = k % n;
            
            answer.add(Math.max(i, j) + 1);
        }
        
        return answer;
    }
}