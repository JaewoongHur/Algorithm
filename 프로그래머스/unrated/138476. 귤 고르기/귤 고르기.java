import java.util.*;
import java.io.*;
    
class Solution {
    public long solution(long k, int[] tangerine) {
        int n = tangerine.length;
        int[] cnt = new int[10000001];
        
        for(int i=0;i<n;i++){
            cnt[tangerine[i]]++;
        }
        
        long[] cnt2 = new long[100001];
        
        for(int i=0;i<10000001;i++){
            if(cnt[i]!=0){
            cnt2[cnt[i]]++;
            }
        }
        
        int m = 0;
        for(int i=0;i<100001;i++){
            if(cnt2[i]!=0){
                m++;
            }
        }

        long num = 0;
        long answer = 0;
        for(int i=100000;i>=1;i--){
            if(cnt2[i]!=0){
                k -= cnt2[i] * i;
                num += cnt2[i];
            if(k<0){
                k+= cnt2[i]*i;
                if(k%i==0){
                answer = num - cnt2[i] + k/i;
                  break;
                }
                else{
                    answer = num - cnt2[i] + k/i + 1;
                    break;
                }
              }
                else if(k==0){
                answer= num;
                break;
            }
         }
        }

        return answer;
    }
}