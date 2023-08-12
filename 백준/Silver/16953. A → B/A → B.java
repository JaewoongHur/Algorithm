import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long min = -1;
		Queue<long[]> q = new LinkedList<>();
		q.add(new long[] {A,1});
		
		while(!q.isEmpty()) {
			long[] p = q.poll();
			
			long n = p[0];
			long t = p[1];
			
			if(n == B) {
				min = t;
				break;
			}
			
			if(2*n<=1000000000) {
				q.add(new long[] {2*n,t+1});
			}
			
			if(n*10+1<=1000000000) {
				q.add(new long[] {n*10+1,t+1});
			}
			
		}
		System.out.println(min);
	}

}