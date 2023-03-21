import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			Queue<int[]> q = new LinkedList<>();
			int[] A = new int[11];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				int x = Integer.parseInt(st.nextToken());
				if(i==M) {
					q.offer(new int[] {x,1});
					A[x]++;
				}
				else {
				q.offer(new int[] {x,0});
				A[x]++;
				}
			}
			int cnt = 0;
			int y = 0;
			while(y!=1) {
				int[] p = q.poll();
				int x= p[0];
				if(q.isEmpty()) {
					y = p[1];
					cnt++;
				}
				else {
					boolean t = false;
					for(int i =x;i<10;i++) {
						if(A[i+1]>0) {
							t = true;
						}
					}
					if(t) {
						q.offer(p);
					}
					else {
						cnt++;
						A[x]--;
						y = p[1];						
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);	
	}
}