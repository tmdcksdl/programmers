class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
       for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                char c1 = strings[i].charAt(n);
                char c2 = strings[j].charAt(n);

                // n번째 문자 기준으로 정렬
                if (c1 > c2 || (c1 == c2 && strings[i].compareTo(strings[j]) > 0)) {
                    // 자리 바꾸기
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        answer = strings;
        
        return answer;
    }
}