import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        
        int n = minerals.length;
        int k = picks[0] + picks[1] + picks[2];
        
        int m = n/5;
        
        if(n%5!=0){
            m += 1;
        }
        
        if(k<m){
            m = k;
        }
        
        int[] arr = new int[m];
        
        int idx = 0;
        for(int i=0;i<n;i++){
            if(idx>=m) break;
            if(minerals[i].equals("diamond")){
            arr[idx] += 100;
            } else if(minerals[i].equals("iron")){
                arr[idx] += 10;
            } else{
                arr[idx] += 1;
            }
            if(i % 5 == 4){
                idx++;
            }    
        }

        Arrays.sort(arr);

        for(int i=m-1;i>=0;i--){
            if(picks[0] != 0 ){
                answer += arr[i]/100 +(arr[i]%100)/10 + arr[i]%10;
                picks[0]--;
                continue;
            }
            if(picks[1] != 0){
                answer += arr[i]/100*5 +(arr[i]%100)/10 + arr[i]%10;
                 picks[1]--;
                continue;
            }
            if(picks[2] != 0){
                answer += arr[i]/100*25 +(arr[i]%100)/10*5 + arr[i]%10;
                 picks[2]--;
                continue;
            }
        }
        return answer;
    }
}