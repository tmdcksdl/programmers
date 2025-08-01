import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        for (String city : cities) {
            city = city.toUpperCase();
            
            if (cacheSize == 0) {
                answer += 5;
                continue;
            }
            
            if (cache.contains(city)) {
                answer += 1;
                cache.remove(city);
                cache.addLast(city);
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                
                cache.addLast(city);
                answer += 5;
            }
        }
        
        return answer;
    }
}