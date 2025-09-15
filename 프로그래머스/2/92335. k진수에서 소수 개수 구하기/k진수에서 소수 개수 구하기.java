import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String baseK = Integer.toString(n, k);
        
        String[] parts = baseK.split("0+");
        
        for (String p : parts) {
            if (p.isEmpty()) continue;
            
            long num = Long.parseLong(p);
            
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        
        long limit = (long) Math.sqrt(x);
        
        for (long l = 3; l <= limit; l += 2) {
            if (x % l == 0) return false;
        }
        
        return true;
    }
}