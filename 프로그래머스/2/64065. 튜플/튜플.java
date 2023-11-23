import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int n = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                n++;
            }
        }
        int[] answer = new int[n];
        
        ArrayList<Integer>[] list = new ArrayList[n+1];
        
        for(int i=0;i<=n;i++){
            list[i] = new ArrayList<>();
        }
        
        String u = s.substring(2,s.length()-2);
        
        String[] tuple = u.split("\\},\\{");
        
        
        for(int i=0;i<n;i++){
            String[] el = tuple[i].split(",");
            for(int j=0;j<el.length;j++){
                list[el.length].add(Integer.parseInt(el[j]));
            }            
        }
        
        boolean[] vis = new boolean[100001];
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<list[i+1].size();j++){
                int a = list[i+1].get(j);
                if(vis[a])continue;
                vis[a] = true;
                answer[i] = a;                
            }
            
        }
        
        
        return answer;
    }
}