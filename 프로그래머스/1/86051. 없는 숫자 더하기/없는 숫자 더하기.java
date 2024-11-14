class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] check = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        
        for (int num : numbers) {
            check[num] = 1;
        }
        
        for (int i = 0; i < 10; i++) {
            if (check[i] == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}