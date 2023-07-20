import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int n,m;
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        boolean[][] visit = new boolean[n][m];
        int sR = 0;
        int sC = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 2){
                    sR = i; sC = j;
                }
                if(arr[i][j] == 0 ){
                    visit[i][j] = true;
                }
            }
        }

        int[][] res = new int[n][m];

        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sR,sC,0});
        visit[sR][sC] = true;
        while(!q.isEmpty()) {

            int[] p = q.poll();
            int r = p[0];
            int c = p[1];
            int dist = p[2];

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (!boundaryCheck(nr, nc) || visit[nr][nc] || arr[nr][nc] == 0) {
                    continue;
                }
                q.add(new int[]{nr, nc, dist + 1});
                visit[nr][nc] = true;
                res[nr][nc] = dist + 1;
            }
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if(!visit[i][j]){
                    System.out.print(-1+" ");
                }
                else {
                    System.out.print(res[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
    private static boolean boundaryCheck(int r, int c){
        return r>=0 && r<n && c>=0 && c<m;
    }

}