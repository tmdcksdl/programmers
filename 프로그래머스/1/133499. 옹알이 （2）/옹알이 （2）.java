class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 가능한 발음 배열
        String[] possible = {"aya", "ye", "woo", "ma"};
        // 연속된 발음 배열
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        
        
        for (String element : babbling) {
            // 연속된 발음은 X로 변환
            for (String check : impossible) {
                element = element.replace(check, "X");
            }
            
            // 가능한 발음을 O로 변환
            for (String check : possible) {
                element = element.replace(check, "O");
            }
            
            int check = 0;
            // 불가능한 발음 존재시 check 증가
            for (int i = 0; i < element.length(); i++) {
                if (element.charAt(i) != 'O') {
                    check++;
                    break;
                }
            }
            
            // check가 0이면 가능한 발음으로 answer 증가
            if (check == 0) answer++;
        }
        
        return answer;
    }
}