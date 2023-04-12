import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] dist = new int[N-1];
		int[] cost = new int[N];
		
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int end = Integer.MAX_VALUE;
		for(int i=0;i<N-1;i++) {
			if(end>cost[i]) {
				end = cost[i];
			}
			sum+=end*dist[i];
		}
		System.out.println(sum);
		
	}
}