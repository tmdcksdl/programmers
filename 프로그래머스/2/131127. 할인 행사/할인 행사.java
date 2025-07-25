import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> item = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            item.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> item2 = new HashMap<>();
            item2.putAll(item);
            
            for (int j = i; j < i + 10; j++) {
                String discountItem = discount[j];
                
                if (item2.containsKey(discountItem)) {
                    if (item2.get(discountItem) - 1 == 0) {
                        item2.remove(discountItem);
                    } else {
                        item2.put(discountItem, item2.get(discountItem) - 1);
                    }
                }
            }
            if (item2.size() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}