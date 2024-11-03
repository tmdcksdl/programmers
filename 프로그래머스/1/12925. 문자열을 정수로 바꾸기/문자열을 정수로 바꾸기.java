class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                continue;
            } else {
                answer = answer * 10 + (s.charAt(i) - '0');
            }
        }
        
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            char pm = s.charAt(0);
            
            if (pm == '-') {
                answer = answer * (-1);
            } else {
                answer = answer;
            }
        }
        
        
        return answer;
    }
}