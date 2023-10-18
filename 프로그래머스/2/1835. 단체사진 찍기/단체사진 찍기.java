import java.util.*;
class Solution {
    static char[] kakao;
    static boolean[] visit;
    static int[] order;
    static String[] info;
    static int m, answer;
    static HashMap<Character,Integer> map;
    public int solution(int n, String[] data) {
        answer = 0;
        
        kakao = new char[]{'A','C','F','J','M','N','R','T'};
        visit = new boolean[8];
        order = new int[8];
        info = new String[n];
        map = new HashMap<>();
        m = n;
        for(int i=0;i<n;i++){
            info[i] = data[i];
        }
        
        permutate(0);
        
        return answer;
    }
    static void permutate(int depth){
        if(depth==8){
            boolean pass = true;
            for(int i=0;i<8;i++){
                map.put(kakao[i],order[i]);
            }
           
          out: for(int i=0;i<m;i++){
               String x = info[i];
              
               char a = x.charAt(0);
               char b = x.charAt(2);
               char c = x.charAt(3);
               int y = x.charAt(4)-'0';
               
               int d = Math.abs(map.get(a)-map.get(b))-1;
              
               if(c=='>'){
                   if(d<=y){
                       pass =false;
                       break out;
                   }
               }
                else if(c=='<'){
                   if(d>=y){
                       pass =false;
                       break out;
                   }
               }
              else if(c=='='){
                  if(d>y || d<y){
                      pass = false;
                      break out;
                  }
              }
          }
            
          
            if(pass){
                answer++;
            }
            return;
        }
        
        for(int i=0;i<8;i++){
            if(visit[i]){
                continue;
            }
            visit[i] = true;
            order[depth] = i;
            permutate(depth+1);
            visit[i] = false;
        }
    }
}