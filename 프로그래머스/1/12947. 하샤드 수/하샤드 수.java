class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int original = x;
        
        while (x > 0) {
            sum = sum + (x % 10);
            x = x / 10;
        }
        
        if (original % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}