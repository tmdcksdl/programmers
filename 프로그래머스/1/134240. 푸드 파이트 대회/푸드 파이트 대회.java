class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                answer += Integer.toString(i);
            }
        }
        
        String str = "";
        
        for (int i = answer.length()-1; i >= 0; i--) {
            str += answer.charAt(i);
        }
        
        return answer + "0" + str;
    }
}