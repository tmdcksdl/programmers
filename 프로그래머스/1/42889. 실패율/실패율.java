import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] count = new int[N + 1];
        for (int i : stages) {
            if (i <= N) count[i]++;
        }
        
        int total = stages.length;
        
        double[] fails = new double[N + 1];
        
        for (int i = 1; i <= N; i++) {
            if (total == 0) {
                fails[i] = 0.0;
            } else {
                fails[i] = (double) count[i] / total;
                total -= count[i];
            }
        }
        
        List<double[]> failList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            failList.add(new double[] {i, fails[i]});
        }

        failList.sort(Comparator.comparing((double[] i) -> i[1])
                            .reversed()
                            .thenComparing(i -> i[0]));
        
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failList.get(i)[0];
        }
        
        return answer;
    }
}