class Solution {
    public int solution(int n) {
        int answer = 999999999;
        
        for (int x = n; x > 0; x--) {
            if (n % x == 1) {
                if (answer > x) {
                    answer = x;
                }
            }
        }
        return answer;
    }
}