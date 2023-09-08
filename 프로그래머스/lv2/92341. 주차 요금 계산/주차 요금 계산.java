import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] ac = new int[10000];
        boolean[] io = new boolean[10000]; // IN : true; OUT: false;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<records.length;i++){
            String[] s = records[i].split(" ");
            String[] s1 = s[0].split(":");
            int hour = Integer.parseInt(s1[0]);
            int minute = Integer.parseInt(s1[1]);
            int time = hour * 60 + minute;
            
            int num = Integer.parseInt(s[1]);
            if(!io[num]){
                    map.put(num,time);
            }
            else{
                ac[num] += time - map.get(num);
            }
            io[num] = !io[num];
        }
        int time = 23*60 + 59;
        for(int i=0;i<10000;i++){
            if(io[i]){
                ac[i] += time - map.get(i);
            }
        }
        int n = 0;
        for(int i=0;i<10000;i++){
            if(ac[i]>0){
                n++;
            }
        }
        
        int[] answer = new int[n];
        
        int idx = 0;
        for(int i=0;i<10000;i++){
            if(map.containsKey(i)){
                
                System.out.println(ac[i]);
                if(ac[i]<=fees[0]){
                    answer[idx] = fees[1];
                }
                else{
                    int x = ac[i]-fees[0];
                    if(x%fees[2]!=0){
                        x = x/fees[2] + 1;
                    }
                    else{
                        x /= fees[2];
                    }
                    answer[idx] = fees[1] + x*fees[3];
                }
                idx++;
            }
        }
        return answer;
    }
}