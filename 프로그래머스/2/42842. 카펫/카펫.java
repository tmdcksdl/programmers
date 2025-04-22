class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int width = 0;
        
        for (int i = brown / 2; i > 0; i--) {
            if (total % i == 0) {
                width = total / i;
            }
            
            if (2 * i + 2 * width - 4 == brown && (i-2) * (width-2) == yellow) {
                answer[0] = i;
                answer[1] = width;
                break;
            }
        }
        return answer;
    }
}