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
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 1 ;i<=N;i++) {
			q.offer(i);
		}
		
		int[] arr = new int[N];
		int idx = 0;
		while(!q.isEmpty()) {
			for(int i=0;i<K-1;i++) {
			int cyc = q.poll();
				q.offer(cyc);
			}
			int out = q.poll();
			arr[idx++] = out;			
		}	
		sb.append('<');
		for(int i=0;i<N-1;i++) {
			sb.append(arr[i]).append(',').append(' ');
		}
		sb.append(arr[N-1]).append('>');
		System.out.println(sb);
	}
}