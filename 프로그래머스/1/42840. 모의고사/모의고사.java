import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i%5]) {
                score[0]++;
            }
            if (answers[i] == second[i%8]) {
                score[1]++;
            }
            if (answers[i] == third[i%10]) {
                score[2]++;
            }
        }
        
        int max_score = score[0];
        for (int i = 1; i <= 2; i++) {
            if (max_score < score[i]) {
                max_score = score[i];
            }
        }
        
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++) {
            if (max_score == score[i]) {
                temp.add(i+1);
            }
        }
        
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        
        return answer;
    }
}