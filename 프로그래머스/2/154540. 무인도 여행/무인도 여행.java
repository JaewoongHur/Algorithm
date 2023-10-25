import java.util.*;

class Solution {
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static int n,m,sum;
    static char[][] map;
    static boolean[][] visit;
    
    public int[] solution(String[] maps) {
        n = 0 ; m = 0;
        n = maps.length;
        m = maps[0].length();

        map = new char[n][m];
        visit = new boolean[n][m];
        for(int i=0;i<n;i++){
            String s = maps[i];
            for(int j=0;j<m;j++){
                map[i][j] = s.charAt(j);
            }
        }
     
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visit[i][j] || map[i][j] == 'X')continue;
                sum = 0;
                list.add(bfs(i,j));
            }
        }
    
        if(list.size()==0){
            return new int[]{-1};
        }
        
        
        int k = list.size();
        System.out.print(k);
        
        int[] answer = new int[k];
        for(int i=0;i<k;i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    static int bfs(int r, int c){
        Queue<int[]> q = new LinkedList<>();
        sum = map[r][c]-'0';
        visit[r][c] = true;
        q.add(new int[]{r,c});
        
        while(!q.isEmpty()){
            int[] p = q.poll();
            int x = p[0];
            int y = p[1];
            
            for(int d=0;d<4;d++){
                int nr = x + dr[d];
                int nc = y + dc[d];
            if(!bound(nr,nc) || visit[nr][nc] || map[nr][nc] == 'X'){
                continue;
            }
                q.add(new int[]{nr,nc});
                visit[nr][nc] = true;
                sum += map[nr][nc] -'0';
        }
    }
        return sum;
}
    static boolean bound(int r, int c){
        return r>=0 && r<n && c>=0 && c<m;
    }
    
}