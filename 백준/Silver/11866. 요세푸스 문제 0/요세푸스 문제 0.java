import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int N = Integer.parseInt(s.split(" ")[0]);
		int K = Integer.parseInt(s.split(" ")[1]);
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			q.offer(i);
		}
		sb.append("<");
		while(q.size()>1) {
			for(int i=0;i<K-1;i++) {
				q.offer(q.poll());				
			}
			sb.append(q.poll()+", ");			
		}
		sb.append(q.poll()+">");
		System.out.println(sb);
	}
}