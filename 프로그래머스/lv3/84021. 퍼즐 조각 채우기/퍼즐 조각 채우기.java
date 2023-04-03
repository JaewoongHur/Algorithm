import java.util.*;
import java.io.*;

class Solution {   
static int N,M,table_components, answer, num;
static int[] dr = {-1,0,1,0};
static int[] dc = {0,1,0,-1};
static boolean[][] visit, visit2;
static int[][] check;
static List<List<int[]>> list = new ArrayList<>();
    
    public static int solution(int[][] game_board, int[][] table) {
        N = game_board.length;
        M = game_board[0].length;
        visit = new boolean[N][M];
        visit2 = new boolean[N][M];
        check = new int[N][M];
        answer = 0;
      
        table_components = 0;
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
                if(table[i][j] == 1 && !visit[i][j]){
                    list.add(new ArrayList<>());
                    bfs(i,j, table);  
                    table_components++;
                }
                if(game_board[i][j]==0 && !visit2[i][j]){
                    num=0;
                    bfs1(i,j,game_board);
                }
                
            }
        }       
    
        out: for(int t=0;t<table_components;t++){
            int n = list.get(t).size(); 
            for(int i=0;i<N;i++){
                 for(int j=0;j<M;j++){
                    if(game_board[i][j] == 0){
                        
                       out2: for(int d=0;d<4;d++){
                            int cnt = 0;
                            
                            for(int k=0;k<n;k++){
                                int[] a = list.get(t).get(k);
                                int ar = a[0];
                                int ac = a[1];
                                for(int e=0;e<d;e++){
                                    int tmp = ar;
                                    ar = ac;
                                    ac = -tmp;
                                }
                                 ar += i;  
                                 ac += j;  
                                
                               if(!boundaryCheck(ar,ac) || game_board[ar][ac]==1){
                                    continue out2;
                                }
                                cnt++;
                            }
                           
                           if(cnt == check[i][j]){
                                bfs2(i,j,game_board);
                                continue out;
                            }
                            
                        }
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
          for(int j=0;j<M;j++){
            System.out.print(game_board[i][j]+" ");
          }
         System.out.println();
        }
       
        return answer;
    }
    
    public static boolean boundaryCheck(int r, int c){
        return r>=0 && r<N && c>=0 && c<M;
    }
    
    public static void bfs(int r, int c,int[][] table){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        list.get(table_components).add(new int[]{0,0});
        visit[r][c] = true;
        while(!q.isEmpty()){
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            
            for(int d=0;d<4;d++){
                int nr = x+dr[d];
                int nc = y+dc[d];
            if(!boundaryCheck(nr,nc)||visit[nr][nc]||table[nr][nc] == 0){
                continue;
                }
                q.add(new int[]{nr,nc});
                list.get(table_components).add(new int[]{nr-r,nc-c});
                visit[nr][nc] = true;
            }
            
        }
    }
    
     public static void bfs1(int r, int c,int[][] game_board){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        visit2[r][c] = true;
        num++;
        while(!q.isEmpty()){
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            
            for(int d=0;d<4;d++){
                int nr = x+dr[d];
                int nc = y+dc[d];
            if(!boundaryCheck(nr,nc)||visit2[nr][nc]||game_board[nr][nc] == 1){
                continue;
                }
                q.add(new int[]{nr,nc});
                visit2[nr][nc] = true;
                num++;
            }
        }
         for(int i = 0 ;i<N;i++){
            for(int j=0;j<M;j++){
                if(check[i][j]==0 && game_board[i][j]==0 && visit2[i][j]){
                    check[i][j] = num;
                }  
            }             
         }         
         
    }
    
    public static void bfs2(int r, int c,int[][] game_board){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        if(game_board[r][c]==0){
           game_board[r][c] = 1;
            answer++;
        }
        while(!q.isEmpty()){
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            
            for(int d=0;d<4;d++){
                int nr = x+dr[d];
                int nc = y+dc[d];
            if(!boundaryCheck(nr,nc)||game_board[nr][nc] == 1){
                continue;
                }
                q.add(new int[]{nr,nc});
                game_board[nr][nc] = 1;
                answer++;
            }
            
        }
    }
    

}