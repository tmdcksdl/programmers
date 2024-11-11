import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        
        for (int num : arr) {
            if (num % divisor == 0) {
                count ++;
            }
        }
        
        int[] answer = new int[count];
        
        int index = 0;
        
        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index++] = num;
            }
        }
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}