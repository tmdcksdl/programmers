class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pSum = 0;
        int ySum = 0;
        
        char[] sList = s.toCharArray();
        
        for (int i = 0; i < sList.length; i++) {
            if (sList[i] == 'p' || sList[i] == 'P') {
                pSum++;
            }
            
            if (sList[i] == 'y' || sList[i] == 'Y') {
                ySum++;
            }
        }
        
        if (pSum != ySum) {
            answer = false;
        }

        return answer;
    }
}