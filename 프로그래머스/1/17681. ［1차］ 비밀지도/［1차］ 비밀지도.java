class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++){
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = transform(binaryString, n);
        }

        return answer;
    }

    private String transform(String binaryString, int n){
        String result = " ".repeat(n - binaryString.length()) + binaryString;
        result = result.replaceAll("1", "#");
        result = result.replaceAll("0", " ");

        return result;
    }
}