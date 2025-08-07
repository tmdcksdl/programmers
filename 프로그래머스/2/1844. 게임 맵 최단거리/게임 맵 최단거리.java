import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int row = maps.length;
        int col = maps[0].length;
        
        boolean[][] visited = new boolean[row][col];
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];
            
            if (x == row -1 && y == col - 1) {
                return dist;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < row && ny < col) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        queue.add(new int[]{nx, ny, dist + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        
        return -1;
    }
}