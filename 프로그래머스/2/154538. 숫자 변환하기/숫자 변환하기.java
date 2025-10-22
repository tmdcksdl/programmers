import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];
        
        queue.add(new int[]{x, 0});
        visited[x] = true;
        
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int num = now[0];
            int count = now[1];
            
            if (num == y) {
                return count;
            }
            
            int[] next = {num + n, num * 2, num * 3};
            
            for (int nxt : next) {
                if (nxt <= y && !visited[nxt]) {
                    visited[nxt] = true;
                    queue.add(new int[]{nxt, count + 1});
                }
            }
        }
        
        return -1;
    }
}