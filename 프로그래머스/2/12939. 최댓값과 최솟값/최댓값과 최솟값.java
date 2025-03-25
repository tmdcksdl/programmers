class Solution {
    public String solution(String s) {
        String answer = "";
        int min = 1000000;
        int max = -100000;
        
        String[] sList = s.split(" ");
        
        for (int i = 0; i < sList.length; i++) {
            if (Integer.parseInt(sList[i]) < min) {
                min = Integer.parseInt(sList[i]);
            }
            
            if (Integer.parseInt(sList[i]) > max) {
                max = Integer.parseInt(sList[i]);
            }
        }
        
        answer = min + " " + max;
        return answer;
    }
}