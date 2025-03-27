import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int num : arr) {
            if(stack.peek() != num) {
                stack.push(num);
            }
        }
        
        answer = new int[stack.size()];
        
        int k = stack.size() - 1;
        
        while(!stack.isEmpty()){
            answer[k--] = stack.pop();
        }
        
        return answer;
        
    }
}