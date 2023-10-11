import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String,Integer> map = new HashMap<>();
        int idx = 0;
        for(int i=0;i<want.length;i++){
                map.put(want[i],idx);
                idx++;
        }
        int answer = 0;
        for(int i=0;i<10;i++){
            if(map.containsKey(discount[i])){
                number[map.get(discount[i])]--;
            }
        }
        int check = 0;
        for(int i=0;i<number.length;i++){
            if(number[i]==0){
                check++;
            }
        }
        if(check==number.length){
            answer++;
        }
        
        for(int i=1;i<=discount.length-10;i++){
            if(map.containsKey(discount[i-1])){
              number[map.get(discount[i-1])]++; 
            }
            if(map.containsKey(discount[i+9])){
                number[map.get(discount[i+9])]--;
            }
            
             check = 0;
            for(int j=0;j<number.length;j++){
                 if(number[j]==0){
                     check++;
                   }
             }
              if(check==number.length){
                 answer++;
             }
        }
        
        
  
        return answer;
    }
}