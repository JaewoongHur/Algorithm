import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int n, arrComp, blindComp;
    static Queue<int[]> q = new LinkedList<>();
    static boolean[][] visit, visitBlind;
    static char[][] arr, blind;
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new char[n][n];
        blind = new char[n][n];

        visit = new boolean[n][n];
        visitBlind = new boolean[n][n];

        String s;

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
                if(arr[i][j] == 'G'){
                    blind[i][j] = 'R';
                }
                else{
                    blind[i][j] = s.charAt(j);
                }
            }
        }

        arrComp=0; blindComp=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visit[i][j]){
                    continue;
                }
                q.add(new int[]{i,j});
                bfs(i,j);
                arrComp++;
            }
        }

        q.clear();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visitBlind[i][j]){
                    continue;
                }
                q.add(new int[]{i,j});
                bfs2(i,j);
                blindComp++;
            }
        }

        System.out.println(arrComp + " " +blindComp);
    }

    static boolean boundary(int r, int c){
        return r>=0 && r<n && c>=0 && c<n;
    }
    static void bfs(int a, int b){
        visit[a][b] = true;
        char x = arr[a][b];
        while(!q.isEmpty()){
            int[] p = q.poll();
            int r = p[0];
            int c = p[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if(!boundary(nr,nc) || visit[nr][nc] || arr[nr][nc] != x ){
                    continue;
                }
                q.add(new int[]{nr,nc});
                visit[nr][nc] = true;
            }
        }
    }
    static void bfs2(int a, int b){
        visitBlind[a][b] = true;
        char x = blind[a][b];
        while(!q.isEmpty()){
            int[] p = q.poll();
            int r = p[0];
            int c = p[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if(!boundary(nr,nc) || visitBlind[nr][nc]|| blind[nr][nc] !=x ){
                    continue;
                }
                q.add(new int[]{nr,nc});
                visitBlind[nr][nc] = true;
            }
        }
    }

}