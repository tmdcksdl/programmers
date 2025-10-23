import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scoreMap = new HashMap<>();
        
        for (char c : new char[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}) {
            scoreMap.put(c, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            int choice = choices[i];
            
            if (choice < 4) {
                scoreMap.put(left, scoreMap.get(left) + (4 - choice));
            } else if (choice > 4) {
                scoreMap.put(right, scoreMap.get(right) + (choice - 4));
            }
        }
        
        String answer = "";
        
        answer += (scoreMap.get('R') >= scoreMap.get('T')) ? "R" : "T";
        answer += (scoreMap.get('C') >= scoreMap.get('F')) ? "C" : "F";
        answer += (scoreMap.get('J') >= scoreMap.get('M')) ? "J" : "M";
        answer += (scoreMap.get('A') >= scoreMap.get('N')) ? "A" : "N";
        
        return answer;
    }
}