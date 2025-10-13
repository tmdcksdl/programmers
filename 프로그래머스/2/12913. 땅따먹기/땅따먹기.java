class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int len = land.length;
        
        for (int i = 1; i < len; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }
        
        int lastRow = len -1;
        for (int j = 0; j < 4; j++) {
            answer = Math.max(answer, land[lastRow][j]);
        }

        return answer;
    }
}