import java.util.*;

class Solution {
    static int n,m;
    static char[][] map;
    static boolean[][] visit;
    public int solution(String[] maps) {
        int time = 0;
        
        n = maps.length;
        m = maps[0].length();
        
        map = new char[n][m];
        
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        
        int sR = 0; int sC = 0;
        int lR = 0; int lC = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             map[i][j] = maps[i].charAt(j);
              if(map[i][j] == 'S'){
                sR = i; sC = j;
               }
            }            
        }
        
        visit = new boolean[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {sR,sC,0});
        visit[sR][sC] = true;
        
        boolean lever = false;
        
        while(!q.isEmpty()){
            
           int[] p = q.poll();
           int r = p[0];
           int c = p[1];
           int t = p[2];
            
           if(map[r][c] == 'L'){
               visit = new boolean[n][m];
               lR = r; lC = c;
               time += t;
               lever = true;
               break;
           }
        
            for(int d=0;d<4;d++){
                int nr = r + dr[d];
                int nc = c + dc[d];
                
                if(!bound(nr,nc) || map[nr][nc] == 'X' || visit[nr][nc]){
                    continue;
                }
                q.add(new int[]{nr,nc, t+1});      
                visit[nr][nc] = true;
            } 
        }
        
        if(!lever){
            return -1;
        }
        
        q.clear();
        
        q.add(new int[] {lR,lC,0});
        visit[lR][lC] = true;
        boolean exit = false;
        
        while(!q.isEmpty()){
           int[] p = q.poll();
           int r = p[0];
           int c = p[1];
           int t = p[2];
            
            if(map[r][c] == 'E'){
               time += t;
               exit = true;
               break;
           } 
            
             for(int d=0;d<4;d++){
                int nr = r + dr[d];
                int nc = c + dc[d];
                
                if(!bound(nr,nc) || map[nr][nc] == 'X' || visit[nr][nc]){
                    continue;
                }
                q.add(new int[]{nr,nc, t+1});   
                visit[nr][nc] = true;
            }
            
        }
        
         if(!exit){
            return -1;
        }
        
        return time;
    }
    
    static boolean bound(int r, int c){
        return r>=0 && r<n && c>=0 && c<m;
    }
}