import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] scores = new int[3];
        int idx = 0;
        int num = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if (Character.isDigit(c)) {
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i+1) == '0') {
                    num = 10;
                    i++;
                } else {
                    num = c - '0';
                }
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'S') {
                    num = (int) Math.pow(num, 1);
                } else if (c == 'D') {
                    num = (int) Math.pow(num, 2);
                } else if (c == 'T') {
                    num = (int) Math.pow(num, 3);
                }
                
                scores[idx++] = num;
            } else if (c == '*'  || c == '#') {
                if (c == '*') {
                    scores[idx-1] *= 2;
                    if (idx > 1) {
                        scores[idx-2] *= 2;
                    }
                } else if (c == '#') {
                    scores[idx-1] *= -1;
                }
            }
        }
        
        answer = scores[0] + scores[1] + scores[2];
        
        return answer;
    }
}