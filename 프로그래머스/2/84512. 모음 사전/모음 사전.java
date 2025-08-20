class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String vowel = "AEIOU";
        
        int[] weight = new int[vowel.length() + 1];
        
        for (int i = vowel.length() - 1; i >= 0; i--) {
            weight[i] = weight[i + 1] * 5 + 1;
        }
        
        for (int i = 0; i < word.length(); i++) {
            answer += weight[i] * vowel.indexOf(word.charAt(i));
        }
        
        return answer + word.length();
    }
}