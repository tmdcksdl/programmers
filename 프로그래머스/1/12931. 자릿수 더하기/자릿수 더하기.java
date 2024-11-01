import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            int div = n % 10;
            answer = answer + div;
            n = n / 10;
        }

        return answer;
    }
}