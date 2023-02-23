import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Long> pq = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			pq.offer(Long.parseLong(br.readLine()));
		}
		long sum = 0;
		
		for( int i=1;i<N;i++) {
			long a = pq.poll();
			long b = pq.poll();
			a= a+b;
			pq.offer(a) ;
			sum += a;
		}	
		
		System.out.println(sum);	
	}
}