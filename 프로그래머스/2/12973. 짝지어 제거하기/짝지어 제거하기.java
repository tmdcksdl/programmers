import java.util.*;

class Solution{
    public int solution(String s){
        int answer = -1;

        if (s.length() == 1) {
            return 0;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.size() == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}