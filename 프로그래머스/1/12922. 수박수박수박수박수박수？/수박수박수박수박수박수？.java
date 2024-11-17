class Solution {
    public String solution(int n) {
        String answer = "";
        String watermelon = "수박".repeat(5000);
        
        answer = watermelon.substring(0, n);
        
        return answer;
    }
}