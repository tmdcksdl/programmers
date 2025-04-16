class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binaryN = Integer.toBinaryString(n);
        binaryN = binaryN.replace("0", "");
        int nLength = binaryN.length();
        
        int m = n+1;
        String binaryM = Integer.toBinaryString(m);
        binaryM = binaryM.replace("0", "");
        int mLength = binaryM.length();
        
        
        while (nLength != mLength) {
            m++;
            
            binaryM = Integer.toBinaryString(m);
            binaryM = binaryM.replace("0", "");
            mLength = binaryM.length(); 
        }
        
        answer = m;
        
        return answer;
    }
}