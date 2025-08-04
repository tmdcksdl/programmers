import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer, Integer> chulsu = new HashMap<>();
        HashSet<Integer> brother = new HashSet<>();
        
        for (int t : topping) {
            chulsu.put(t, chulsu.getOrDefault(t, 0) + 1);
        }
        
        for (int t : topping) {
            brother.add(t);
            
            int count = chulsu.get(t);
            if (count == 1) {
                chulsu.remove(t);
            } else {
                chulsu.put(t, count - 1);
            }
                
            if (brother.size() == chulsu.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}