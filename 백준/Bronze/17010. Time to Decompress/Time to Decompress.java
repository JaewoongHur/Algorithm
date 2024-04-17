import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
			
		int n = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<n;tc++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			
			String b = st.nextToken();
			
			for(int i=0;i<a;i++) {
				sb.append(b);
			}
			
			sb.append('\n');
		}
		System.out.println(sb);
	}
}