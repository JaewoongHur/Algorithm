import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	
	static class Number implements Comparable <Number> {
		
		int num;
		
		public Number(int num) {
			this.num = num;
		}
		
		@Override
		public int compareTo(Number o) {
			
			if(Math.abs(this.num) > Math.abs(o.num)) {
				return 1;
			}
			else if(Math.abs(this.num)==Math.abs(o.num)) {
				return this.num-o.num;
			}
			return -1;			
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Number> pq = new PriorityQueue<>();
		
		for(int i=0;i<N;i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a==0) {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(pq.poll().num).append("\n");
				}
			}
			else {
				pq.add(new Number(a));
			}

		}
		System.out.println(sb);
	}
}