import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        
        int min = 0;
        int min2 = 0;
        
        for(int i=0;i<scoville.length;i++){
            q.add(scoville[i]);
        }
        int nm=0;
        

        while(q.size()>1){
            min = q.poll();
            min2 = q.poll();
            if(min>=K && min2>=K){
                return answer;
            }
            
            nm = min + min2*2;
            answer++;
            q.add(nm);
        }
        int a = q.poll();
        if(a>=K){
            return answer;
        }
        return -1;
    }
}