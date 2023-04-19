import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		boolean[] visit = new boolean[100001];
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {N,0});
		visit[N] = true;
		int time = 0;
		while(!q.isEmpty()) {
			int[] X = q.poll();
			
			int p = X[0];
			int cnt = X[1];
		
			if(p == K) {
				time = cnt;
				break;
			}
			
			int p1 = p-1;
			int p2 = p+1;
			int p3 = 2*p;
			
			if(p1>=0 && !visit[p1]) {
				q.add(new int[]{p1,cnt+1});
				visit[p1] = true;
			}
			if(p2<=100000 && !visit[p2]) {
				q.add(new int[]{p2,cnt+1});
				visit[p2] = true;
			}
			if(p3<=100000 && !visit[p3]) {
				q.add(new int[]{p3,cnt+1});
				visit[p3] = true;
			}
		}
		System.out.println(time);
	}
}