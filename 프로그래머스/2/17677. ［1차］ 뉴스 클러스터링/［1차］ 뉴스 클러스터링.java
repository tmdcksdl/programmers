import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String str = str1.substring(i, i + 2);
            
            if (str.matches("[a-zA-Z]{2}")) {
                arr1.add(str.toUpperCase());
            }
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            String str = str2.substring(i, i + 2);
            
            if (str.matches("[a-zA-Z]{2}")) {
                arr2.add(str.toUpperCase());
            }
        }
        
        ArrayList<String> temp = new ArrayList<>(arr2);
        double inter = 0;
        
        for (String str : arr1) {
            if (temp.contains(str)) {
                inter++;
                temp.remove(str);
            }
        }
        
        double union = arr1.size() + arr2.size() - inter;
        
        if (union == 0) {
            return 65536;
        }
        
        answer = (int)(inter / union * 65536);
        
        return answer;
    }
}