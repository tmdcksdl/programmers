class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            int sLength = s.length();
            String replaceS = s.replace("0", "");
            
            int changeLength = replaceS.length();
            answer[1] += sLength - changeLength;
            
            s = Integer.toBinaryString(changeLength);
            
            answer[0]++;
        }
        
        return answer;
    }
}