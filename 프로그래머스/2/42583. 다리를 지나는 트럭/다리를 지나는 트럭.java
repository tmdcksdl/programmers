import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<int[]> bridge = new LinkedList<>();
        int currentWeight = 0;
        int idx = 0;
        
        while (idx < truck_weights.length || !bridge.isEmpty()) {
            answer++;
            
            if (!bridge.isEmpty() && bridge.peek()[1] == answer) {
                currentWeight -= bridge.poll()[0];
            }
            
            if (idx < truck_weights.length) {
                if (truck_weights[idx] + currentWeight <= weight && bridge.size() < bridge_length) {
                    bridge.add(new int[]{truck_weights[idx], answer + bridge_length});
                    currentWeight += truck_weights[idx];
                    idx++;
                }
            }
        }
        
        return answer;
    }
}