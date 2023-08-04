import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] visit = new boolean[100001];
		
		
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {N,0});	
		
		while(!q.isEmpty()){
			int[] p = q.poll();
			int cur = p[0];
			int time = p[1];
			
			visit[cur] = true;
			
			if(cur==K) {
				if(min>time) {
					min = Math.min(min, time);
					cnt++;
				}
				else if(min==time){
					cnt++;
				}
				else {
					break;
				}
				visit[K] = true;
			}
			if(cur-1>=0 && !visit[cur-1]) {
				q.add(new int[] {cur-1,time+1});
			}
			if(cur+1<=100000 && !visit[cur+1]) {
				q.add(new int[] {cur+1,time+1});
			}
			if(cur*2<=100000 && !visit[cur*2]) {
				q.add(new int[] {cur*2,time+1});
			}
		}
		System.out.println(min);
		System.out.println(cnt);
	}
}