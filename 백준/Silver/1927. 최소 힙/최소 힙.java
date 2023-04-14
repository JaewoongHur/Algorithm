import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	
	static class Heap implements Comparable<Heap>{
		int num;
		
		public Heap(int num) {
			this.num = num;
		}
		
		@Override
		public int compareTo(Heap o) {
			
			return this.num-o.num;
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Heap> pq = new PriorityQueue<>();
		
		for(int i=0;i<N;i++) {
			int a =Integer.parseInt(br.readLine());
		
			if(a==0) {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(pq.poll().num).append("\n");
				}
			}
			else {
				pq.add(new Heap(a));
			}
			
			
		}
		System.out.println(sb);
		
	}
}