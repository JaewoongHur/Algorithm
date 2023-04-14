import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	
	static class Num implements Comparable<Num>{
		int x;
		
		public Num(int x) {
			this.x = x;
		}
		
		@Override
		public int compareTo(Num o) {
			
			return -this.x + o.x;
		}
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Num> pq = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a==0) {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(pq.poll().x).append("\n");
				}
			}
			else {
				pq.add(new Num(a));
			}
			
		}
		System.out.println(sb);
	}
}