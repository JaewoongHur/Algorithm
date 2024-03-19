import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		
		for(int tc=1;tc<=n;tc++) {
			int m = Integer.parseInt(br.readLine());
			int s = 0;
			for(int i=0;i<m;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				s += a * b;
			}
			
			sb.append(36*36/s).append(' ').append(36*36*2/s).append(' ').append(36*36*3/s).append('\n');
		}
		System.out.println(sb);
	}
}