import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> sizeCountMap = new HashMap<>();
        
        for (int t : tangerine) {
            sizeCountMap.put(t, sizeCountMap.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> sizeCounts = new ArrayList<>(sizeCountMap.values());
        sizeCounts.sort(Comparator.reverseOrder());
        
        for (int count : sizeCounts) {
            k -= count;
            answer++;
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}