import java.util.*;

class Solution {
    static int max;
    static int[] arr, ans;

    public int[] solution(int n, int[] info) {
        
        arr = new int[11]; // lion의 배열
        ans = new int[11];
        
        max = Integer.MIN_VALUE;
        
        multicombination(info,0,0,n);
        
        if(max == Integer.MIN_VALUE){
            ans = new int[]{-1};
        }        
        return ans;
    }
    private static void multicombination(int[] info,int idx, int cnt, int n){
        if(cnt == n){
            int apeach = 0;
            int lion = 0;
            for(int i=0;i<11;i++){
                if(arr[i] ==0 && info[i]==0){
                    continue;
                }
                if(arr[i]<=info[i]){
                    apeach += 10-i;
                }
                else{
                    lion += 10-i;
                }
            }
           
            if(lion>apeach){
                if(lion-apeach>max){
                    max = lion-apeach;
                    for(int i=0;i<11;i++){
                        ans[i] = arr[i];
                    }
                }
                else if(lion-apeach == max){
                    boolean check = false;
                    for(int i=10;i>=0;i--){
                        if(arr[i] == ans[i]) continue;
                        if(arr[i] < ans[i]) break;
                        if(arr[i] > ans[i]){
                            check = true;
                          break;
                        }
                    }
                    if(check){
                     for(int j=0;j<11;j++){
                        ans[j] = arr[j];
                      }
                    }
                }
            }            
            return;
        }
        
        for(int i=idx;i<11;i++){
            arr[i]++;
            multicombination(info, i,cnt+1,n);
            arr[i]--;
        }
    
    }
    
    
}