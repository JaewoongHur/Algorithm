import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visit = new boolean[N+1];
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<p;i++) {
            int k = Integer.parseInt(st.nextToken());
            q.add(k);
            visit[k] = true;
        }

        ArrayList<Integer>[] party = new ArrayList[M];

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            party[i] = new ArrayList<>();
            int k = Integer.parseInt(st.nextToken());
            for(int j=0;j<k;j++) {
                party[i].add(Integer.parseInt(st.nextToken()));
            }

        }



        ArrayList<Integer>[] list = new ArrayList[N+1];
        for(int i=0;i<=N;i++) {
            list[i]= new ArrayList<>();
        }

        for(int i=0;i<M;i++) {
            int num = party[i].size();

            for(int j=0;j<num;j++) {
                for(int k=j+1;k<num;k++) {
                    list[party[i].get(j)].add(party[i].get(k));
                    list[party[i].get(k)].add(party[i].get(j));
                }
            }
        }

        while(!q.isEmpty()) {
            int x = q.poll();

            int n = list[x].size();

            for(int i=0;i<n;i++) {
                int y = list[x].get(i);
                if(visit[y]) {
                    continue;
                }
                q.add(y);
                visit[y] = true;
            }
        }



        int cnt = 0;
        for(int i=0;i<M;i++) {
            int n = party[i].size();
            for(int j=0;j<n;j++) {
                if(visit[party[i].get(j)]) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(M-cnt);
    }
}