import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> sumSet = new HashSet<>();
        
        for (int i = 0; i < elements.length; i++) {
            int num = 0;
            for (int j = 0; j < elements.length; j++) {
                num += elements[(i+j)%elements.length];
                sumSet.add(num);
            }
        }

        answer = sumSet.size();
        
        return answer;
    }
}