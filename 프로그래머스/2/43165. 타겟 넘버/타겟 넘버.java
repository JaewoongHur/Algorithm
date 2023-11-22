import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        int n = numbers.length;
        
        
        for(int i=0;i<(int)Math.pow(2,n);i++){
            String s = Integer.toBinaryString(i);
            int m = s.length();
            
            int sum = 0;
            
            for(int j=m-1;j>=0;j--){
                if(s.charAt(j)=='1'){
                    sum += numbers[n-m+j];
                }
                else{
                    sum -= numbers[n-m+j];
                }
            }
            for(int j=0;j<n-m;j++){
                sum -= numbers[j];
            }
            
            if(sum == target){
                answer++;
            }
            
        }

        return answer;
    }
}