import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int length = nums.length / 2;
        
        if (map.size() >= length) {
            answer = length;
        } else {
            answer = map.size();    
        }
        
        return answer;
    }
}