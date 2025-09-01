import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Arrays.fill(answer, -1);

        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            int num = numbers[i];

            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                answer[i] = stack.peek();
            }

            stack.push(num);
        }
        
        return answer;
    }
}