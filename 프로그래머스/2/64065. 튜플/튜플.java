import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("},\\{");
        
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        
        List<Integer> tuple = new ArrayList<>();
        
        for (String set : sets) {
            String[] nums = set.split(",");
            
            for (String num : nums) {
                int value = Integer.parseInt(num);
                if (!tuple.contains(value)) {
                    tuple.add(value);
                }
            }
        }
        
        return tuple.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}