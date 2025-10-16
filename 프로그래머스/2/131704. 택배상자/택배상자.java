import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int len = order.length;
        int orders = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 1; i <= len; i++) {
            if(orders < len && i == order[orders]) {
                answer++;
                orders++;
            } else {
                stack.push(i);
            }
            
            while (orders < len && !stack.isEmpty() && stack.peek() == order[orders]) {
                stack.pop();
                answer++;
                orders++;
            }
        }
        
        while (orders < len && !stack.isEmpty() && stack.peek() == order[orders]) {
            stack.pop();
            answer++;
            orders++;
        }
        
        return answer;
    }
}