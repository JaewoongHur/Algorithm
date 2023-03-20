import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<List<Integer>> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[n+1];
		int cnt=0;
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			list.get(a).add(b);
			list.get(b).add(a);			
		}
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		visit[1] = true;
		while(!q.isEmpty()) {
			int p = q.poll();
			int r = list.get(p).size();
			for(int i=0;i<r;i++) {
				int k = list.get(p).get(i);
				if(!visit[k]) {
					q.offer(k);
					visit[k] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);		
	}	
}