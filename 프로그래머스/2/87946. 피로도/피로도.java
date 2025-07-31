import java.util.*;

class Solution {
    static int answer = 0;
    static boolean[] isVisited;
    
    public int solution(int k, int[][] dungeons) {
        isVisited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0];
            int consumed = dungeons[i][1];
            
            if (!isVisited[i] && k >= need) {
                isVisited[i] = true;
                dfs(k - consumed, dungeons, cnt + 1);
                isVisited[i] = false;
            }
        }
        
        answer = Math.max(answer, cnt);
    }
}