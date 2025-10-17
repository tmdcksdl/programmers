import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> accMap = new HashMap<>();
        
        for (String record : records) {
            String[] s = record.split("\\s+");
            int m = toMinutes(s[0]);
            String car = s[1];
            String io = s[2];
            
            if (io.equals("IN")) {
                inMap.put(car, m);
            } else {
                int min = inMap.remove(car);
                accMap.put(car, accMap.getOrDefault(car, 0) + (m - min));
            }
        }
        
        for (Map.Entry<String, Integer> e : inMap.entrySet()) {
            String car = e.getKey();
            int in = e.getValue();
            accMap.put(car, accMap.getOrDefault(car, 0) + (1439 - in));
        }
        
        List<String> cars = new ArrayList<>(accMap.keySet());
        Collections.sort(cars);
        
        int[] answer = new int[cars.size()];
        
        for (int i = 0; i < cars.size(); i++) {
            int minutes = accMap.get(cars.get(i));
            
            if (minutes <= fees[0]) {
                answer[i] = fees[1];
                continue;
            }
            
            int extra = minutes - fees[0];
            int unitT = fees[2];
            int unitC = fees[3];
            
            int units = (extra + unitT - 1) / unitT;
            int total = fees[1] + units * unitC;
            
            answer[i] = total;
        }
        
        return answer;
    }
    
    private int toMinutes(String time) {
        String[] t = time.split(":");
        int hour = Integer.parseInt(t[0]);
        int minute = Integer.parseInt(t[1]);
        
        return hour * 60 + minute;
    }
}