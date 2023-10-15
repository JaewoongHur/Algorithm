import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int sum = -1;
		
		int[] S = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			sum += Integer.parseInt(br.readLine());
			S[i] = sum;
		}
		
		for(int i=0;i<Q;i++) {
			int a = Integer.parseInt(br.readLine());
			
			for(int j=1;j<=N;j++) {
				if(S[j]>=a) {
					sb.append(j).append('\n');
					break;
				}
			}
			
		}
		System.out.println(sb);
	}
}